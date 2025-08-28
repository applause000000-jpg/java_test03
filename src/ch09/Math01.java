package ch09;

public class Math01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.abs(-3.14));
		System.out.println(Math.sqrt(9.0));
		System.out.println(Math.exp(2));
		System.out.println(Math.round(3.14));
		
		System.out.print("이번주행운의번호는");
		 for (int i=0; i<5; i++)
			 System.out.print((int)(Math.random()*45 + 1) + " ");
	}

}
