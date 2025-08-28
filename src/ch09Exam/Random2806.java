package ch09Exam;

import java.util.Scanner;

public class Random2806 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			boolean fl = false;
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
			int num=sc.nextInt();
			int pc=(int)(Math.random()*3+1);
			switch(num) {
			case 1:
				if(pc==1) {
					System.out.println("사용자 가위 : 컴퓨터 가위");
					System.out.println("사용자가 비겼습니다.");
				}
				else if(pc==2) {
					System.out.println("사용자 가위 : 컴퓨터 바위");
					System.out.println("사용자가 졌습니다.");
				}
				else {
					System.out.println("사용자 가위 : 컴퓨터 보");
					System.out.println("사용자가 이겼습니다.");
				}
				break;
			case 2:
				if(pc==1) {
					System.out.println("사용자 바위 : 컴퓨터 가위");
					System.out.println("사용자가 이겼습니다.");
				}
				else if(pc==2) {
					System.out.println("사용자 바위 : 컴퓨터 바위");
					System.out.println("사용자가 비겼습니다.");
				}
				else {
					System.out.println("사용자 바위 : 컴퓨터 보");
					System.out.println("사용자가 졌습니다.");
				}
				break;
			case 3: 
				if(pc==1) {
					System.out.println("사용자 보 : 컴퓨터 가위");
					System.out.println("사용자가 졌습니다.");
				}
				else if(pc==2) {
					System.out.println("사용자 보 : 컴퓨터 바위");
					System.out.println("사용자가 이겼습니다.");
				}
				else {
					System.out.println("사용자 보 : 컴퓨터 보");
					System.out.println("사용자가 비겼습니다.");
				}
				break;
			case 4: fl=true;
			}
			if(fl) {
				System.out.println("게임 종료");
				break;
			}
		}

	}

}
