package ch10;

class Student{
	private int sno;
	private String name;
	private String major;
	private int java;
	private int db;
	private int python;
	private int avg;
	private int rank;
	
	
	public Student(int sno, String name, String major, int java, int db, int python, int avg, int rank) {
		super();
		this.sno = sno;
		this.name = name;
		this.major = major;
		this.java = java;
		this.db = db;
		this.python = python;
		this.avg = avg;
		this.rank = rank;
	}
	public Student(int sno, String name,String major) {
		this.sno=sno;
		this.name=name;
		this.major=major;
	}
	public String toString() {
		return +sno+","+name+","+major;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
