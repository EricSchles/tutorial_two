/*
how to compile:
javac lesson_five.java interfacing.java
java lesson_five

Explanation:

Interfaces are useful for prototyping code and also for making sure someone else
writes all the code they are supposed to, in order to use other code.

For instance, say you wrote something that assumes every object you pass around has a toString method
or a has_cats method.  If you pass in an object that doesn't have such a method, the code may fail.

By forcing all objects passed in to conform to an interface, it will always be clear what methods or variables are
required.  

This isn't particularly useful when you are working by yourself, however when you work with others and particularly on
large scale projects, this is extremely useful.  Of course we could all just be good communicators, but that doesn't
really tend to happen.

*/
class implementar implements interfacing {
	//prints hello + x
	public void hello(String x){
		print("Hello"+x);
	}
	
	//wraps System.out.println
	public <T> void print(T input){
		System.out.println(input);
	}
	
	public Boolean rabbies(Object obj){
		return true;
	}
	//check if obj has .rabbies property.  if set to true, return true
	//else return false.
}
class lesson_five{

	
}