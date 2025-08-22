package ch06test;

public class Song {

	String title;
	public String getTitle() {
		return title;
	}
	public Song(String title) {
		this.title = title;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Song mysong = new Song("Nessun Dorma");
		Song yoursong = new Song("공주는 잠이 어쩌구");
		System.out.println("내 노래 "+mysong.getTitle());
		System.out.println("니 노래 "+yoursong.getTitle());
	}

}
