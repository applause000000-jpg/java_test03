package workEx;

public class Book {

	private String title;
	private String author;
	private String publisher;
	private String sort;
	
	public Book() {}
	public Book(String title, String author, String publisher, String sort) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.sort = sort;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}
	public void chTitle(String title) {
		this.title=title;
	}

	@Override
	public String toString() {
		return this.getTitle()+"\t"+this.getAuthor()+"\t"+this.getPublisher()+"\t"+this.getSort();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book a = new Book();
		a.setTitle("82년생");
		a.setAuthor("조남주");
		a.setPublisher("민읍사");
		a.setSort("소설");
		Book b = new Book("파리아파트","기욤뭐소","밝은세상","소설");
		Book c = new Book("v","이자료","DB출판사","컴퓨터/IT");
		c.chTitle("자료구조");
		System.out.println("제목\t저자\t출판사\t분류");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(c);
	}

}
