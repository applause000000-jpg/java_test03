package ch09Exam;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenExam2804 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		StringTokenizer st=new StringTokenizer(a,"+");
		int sum=0;
		while(st.hasMoreTokens()) {
			sum+=Integer.parseInt(st.nextToken().trim());
		}
		System.out.println("합은 "+sum);
	}

}
