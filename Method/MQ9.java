class MQ9{
	public static void main(String [] args){
		hello9(6);	
	}
	public static void hello(int month){
		switch (month){
		case 1,3,5,7,8,10,12:
			System.out.println("31 days");
			break;
		case 2:
			System.out.println("28/29 days");
			break;
		case 4,6,9,11:
			System.out.println("30 days");
			break;
		default:
			System.out.println("Invalid");
		
		} 
	}
}