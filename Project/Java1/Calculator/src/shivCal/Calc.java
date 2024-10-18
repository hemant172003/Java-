package shivCal;

import additionProg.Additation;
import divisionProg.Division;
import extraProg.Cube;
import extraProg.Square;
import multiplicationProg.Product;
import subtractionProg.Subtraction;

public class Calc {
	
	public static void main(String [] args) {
	
		Additation a = new Additation();
		System.out.println(a.add(56, 4));
		System.out.println(Additation.add(56, 4, 9));
		
		Division b = new Division();
		System.out.println(b.div(56, 4));
		
		Product p = new Product();
		System.out.println(Product.pro(4, 5));
		System.out.println(p.pro(4, 5, 6));
		Subtraction s = new Subtraction();
		System.out.println(s.sub(5, 2));
		
//		Cube c = new Cube();
		System.out.println(Cube.getcube(5));
		
		Square sq = new Square();
		System.out.println(sq.getsqr(6));
		
	
	}

}
