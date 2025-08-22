package ch06test;

import java.util.Scanner;

public class PhoneManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수>>");
		int p = sc.nextInt();
		Phone1[] a = new Phone1[p];
		for(int i = 0; i<a.length;i++) {
			System.out.print("이름과 전번");
			String name = sc.next();
			String tel = sc.next();
			a[i]=new Phone1(name,tel);
		}
		System.out.println("저장되었습니다....");
		
		while(true) {
			System.out.print("검색할 이름>>");
			String s=sc.next();
			if(s.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			for(int i = 0; i<a.length;i++) {
				if(a[i].getname().equals(s)) {
					System.out.println(a[i].getname()+"의 번호 "+a[i].gettel());
					break;
				}
				if(i==a.length-1)
					System.out.println(s+" 이 없습니다.");
			}
			
		}
		sc.close();
	}

}
