
class A{
	public Integer first;
	public String second;
	private Integer a_first;
	private String a_second;
	
	A(int first, String second){
		this.first = first;
		this.second = second;
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
	}
}