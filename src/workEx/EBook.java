package workEx;

public class EBook extends Book{

	private int service_time;
	private int service_machines;
	
	public EBook() {}
	public EBook(String title, String author, String publisher, String sort,int service_time, int service_machines) {
		super(title,author,publisher,sort);
		this.service_time = service_time;
		this.service_machines = service_machines;
	}

	
	public int getService_time() {
		return service_time;
	}
	public void setService_time(int service_time) {
		this.service_time = service_time;
	}
	public int getService_machines() {
		return service_machines;
	}
	public void setService_machines(int service_machines) {
		this.service_machines = service_machines;
	}
	@Override
	public String toString() {
		return super.toString()+"\t"+this.getService_time()+"\t"+this.getService_machines();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book a = new EBook("82년생","조남주","민읍사","소설",30,5);
		Book b = new EBook("파리아파트","기욤뭐소","밝은세상","소설",30,2);
		System.out.println("제목\t저자\t출판사\t분류\t유효기간\t사용기기수");
		System.out.println(a);
		System.out.println(b);
	}

}
