public interface interfacing{
	void hello(String x);
	//prints hello + x
	void <T> print(T input);
	//wraps System.out.println
	Boolean rabbies(Object obj);
	//check if obj has .rabbies property.  if set to true, return true
	//else return false.
	
}