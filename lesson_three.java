import java.util.Scanner;

public class lesson_three{
	public static <T> void print(T input){
		System.out.println(input);
	}
	public static int len(String input){
		try{
			return input.length();
		}catch(Exception e){
			return 0;
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		print("Hello there, what's your name?");
		String name = in.nextLine();
		if(name.equals("Eric")){
			print("Hello fearless leader, welcome back to the chamber of doom");
		}else{
			print("Hello"+name);	
		}
		if(len(name) <= 500){
			double x = (double) len(name);
			x += 7.0245;
			print(x);
		} else{
			long x = (long) len(name);
			x += 19238050;
			print(x);
		}
	}
}