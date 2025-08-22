package ch06;

public class ProductEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1=new Product();
		p1.pno=1;
		p1.name="컴";
		p1.price=100;
		p1.company="LG";
		p1.display();
		
		Product p2=new Product(2,"연필");
		p2.price=200;
		p2.company="동화";
		p2.display();
		
		Product p3=new Product(3,"노트", 100, "문화");
		p3.display();
		
	}

}
