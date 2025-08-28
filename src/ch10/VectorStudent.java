package ch10;

import java.util.Vector;

class Student1{
	private int sno;
	private String name;
	private String major;
	public Student1(int sno, String name,String major) {
		this.sno=sno;
		this.name=name;
		this.major=major;
	}
	public String toString() {
		return +sno+","+name+","+major;
	}
}



public class VectorStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Student1> v=new Vector<>();
		v.add(new Student1(1,"홍길동", "컴공"));
		v.add(new Student1(2,"홍동", "치킨"));
		v.add(new Student1(3,"길동", "요리"));
		v.add(new Student1(4,"이길동", "게임"));
		v.add(new Student1(5,"박길동", "피자"));
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		Object[] arr=v.toArray();
		for(Object a:arr) {
			System.out.println(a);
		}
	}

}
