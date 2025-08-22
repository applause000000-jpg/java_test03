package ch06;

public class ProdctEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] pro=new Product[3];
		pro[0]=new Product(1,"마이크", 20000, "삼성");
		pro[1]=new Product(2,"키보드", 20000, "LG");
		pro[2]=new Product(3,"마우스", 5000, "삼성");
		
		for(Product p:pro) {
			p.display();
		}
	}

}
