package ch10;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vs = new Vector<>();
		vs.add("a");
		vs.add("b");
		vs.add("c");
		System.out.println(vs.contains("d"));
//		System.out.println(vs.elementAt(0));
//		System.out.println(vs.get(0));
//		vs.remove("a");
		Object[] arr=vs.toArray();
		for(Object a:arr) {
			System.out.println(a);
		}
		
		for(int i=0;i<vs.size();i++) {
			System.out.println(vs.get(i));
		}
	}

}
