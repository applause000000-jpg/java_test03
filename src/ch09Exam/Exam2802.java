package ch09Exam;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam2802 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		while(true) {
			System.out.println("문장을 입력");
			String a=sc.nextLine();
			StringTokenizer st=new StringTokenizer(a," ",true);
			int cnt=1;
			if(a.equals("exit")) {
				break;
			}
			else {
				while(st.hasMoreTokens()) {
					if(st.nextToken().equals(" ")) {
						cnt++;
					}
				}
			}
			System.out.println("어절 개수는"+cnt);
		}

	}

}
