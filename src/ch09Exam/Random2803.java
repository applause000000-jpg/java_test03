package ch09Exam;

public class Random2803 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int a=(int)(Math.random()*3+1);
			int b=(int)(Math.random()*3+1);
			int c=(int)(Math.random()*3+1);
			System.out.print(a+"\t");
			System.out.print(b+"\t");
			System.out.print(c+"\t");
			if(a==b && a==c) {
				System.out.println();
				System.out.println("성공");
				break;
				
			}
			System.out.println();
		}
		
	}

}
