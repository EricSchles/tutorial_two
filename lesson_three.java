import java.util.Scanner;

public class lesson_three{
	public static <T> void print(T input){
		System.out.println(input);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		print("Hello there, what's your name?");
		String name = in.nextLine();
		if(name.equals("Eric")){
			print("Hello fearless leader, welcome back to the chamber of doom");
		}
		print("Hello"+name);

	}
}