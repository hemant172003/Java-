class MQ10{
	public static void main(String [] args){
		hello("Hemant" , "Verma");	
	}
	public static void hello(String Fname, String Lname){
		if (Fname.length()>Lname.length()){
			int res = Fname.length()*Fname.length();
			System.out.println(res);
		}
		else{
			int res1 = Lname.length()*Lname.length()*Lname.length();
			System.out.println(res1);
		} 
	}
}