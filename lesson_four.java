/*
How to compile:
javac lesson_four.java
java lesson_four

Explanation:

In this lesson we will see some of the real power of java.  The first big thing here is inheritance.  The second big thing is
method overriding.  Other than that, this lesson should be completely clear.

So let's start with inheritance:

Inheritance is the ability for one class to inherit the methods and fields (variables) from another class.  In this example, we
use a very simple example: two classes A and B, where B inherits from A.  This means that anything public

*/
class A{
	public Integer first;
	public String second;
	private Integer a_first;
	private String a_second;
	
	A(int first, String second){
		this.first = first;
		this.second = second;
		this.a_first = 27;
		this.a_second = "this shouldn't be available.";
	}

	public static <T> void print(T input){
		System.out.println(input);
	}

	public void print_vals(){
		print(this.first.toString() + " " + this.second);
	}
}

class B extends A{
	public String third;
	public String fourth;

	B(int first, String second,String third, String fourth){
		super(first,second);
		this.third = third;
		this.fourth = fourth;
	}
	public static <T> void print(T input){
		System.out.println(input);
	}

	public void print_vals(){
		super.print_vals();
		print(this.third + " " + this.fourth);
	}


}
public class lesson_four{
	
	public static void main(String[] args){
		A a = new A(5,"Hello");
		B b = new B(6,"waaa","there","are");

		a.print_vals();
		b.print_vals();
		try{
			A.print(b.a_first);
			A.print(b.a_second);
		}catch(Exception e){
			b.print("Failed to print");
		}
	}
}