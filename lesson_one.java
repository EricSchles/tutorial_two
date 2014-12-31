class lesson_one<T>{

	public static Boolean iAmEric(String name){
		if(name == "Eric"){
			return true;
		} else{
			return false;
		}
	}

	public static <T> void print(T input){
		System.out.println(input);
	}
	public static void main(String[] args){
		print(iAmEric("Eric"));
		print(iAmEric("Bob"));
		print(iAmEric("eric"));
	}
}