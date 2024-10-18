class Constr
{


	public Constr(){

	}
	 Constr(String a){
		System.out.println(a);
	}
	 Constr(int a){
		System.out.println(a);
	}
	 Constr(float a){
		System.out.println(a);
	}
	 Constr(byte a){
		System.out.println(a);
	}
	 Constr(short a){
		System.out.println(a);
	}
	 Constr(char a){
		System.out.println(a);
	}
	public static void main(String [] args)
	{
		Constr b = new Constr("dev");
		Constr c = new Constr(5);
		Constr d = new Constr(5.5f);
		Constr e = new Constr((byte) 4);
		Constr f = new Constr((short) 6);
		Constr g = new Constr('s');
	}
}