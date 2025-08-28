package ch10;

import java.util.Vector;

class Numsum{
	private int num;
	public Numsum(int num) {
		this.num=num;
	}
}



public class VectorNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Numsum> v=new Vector<>();
		v.add(new Numsum(1));
		v.add(new Numsum(2));
		v.add(new Numsum(3));
		v.add(new Numsum(4));
		v.add(new Numsum(5));
		int sum=0;
		Object[] arr=v.toArray();
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
			System.out.println("합:"+sum);
		}
		for(Object a:arr) {
			System.out.println(a);
		}
	}

}
