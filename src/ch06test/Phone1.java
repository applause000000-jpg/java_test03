package ch06test;

public class Phone1 {

	private String name, tel;
	public Phone1(String name, String tel) {
		this.name=name;
		this.tel=tel;
	}
	public void display() {
		System.out.println(name+"의 번호 "+tel);
	}
	public String getname() {return name;}
	public String gettel() {return tel;}
}
