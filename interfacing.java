public interface interfacing{
	public void hello(String x);
	//prints hello + x
	public <T> void print(T input);
	//wraps System.out.println
	public Boolean has_rabbies(Object obj);
	//check if obj has .rabbies property.  if set to true, return true
	//else return false.
	
}