class MQ6{
	public static void main(String [] args){
		Hello('A');	
	}
	public static void Hello(char ch){
		if (ch >= 'A' && ch <= 'Z'){
			System.out.println("Uppercase");
		}
		else{
			System.out.println("Lowercase");
		} 
	}
}