package ch10Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx {
	static Scanner sc;
	static ArrayList<Student> aStudent;
	
	static void rankPro() {
		for(int i =0;i<aStudent.size();i++) {
			aStudent.get(i).setRank(1);
		}
		for(int i=0;i<aStudent.size();i++) {
			for(int j=0;j<aStudent.size();j++) {
				aStudent.get(i).setRank(aStudent.get(j));
			}
		}
	}
	
	static void input() {
		while(true) {
			int[] score = new int[3];
			System.out.println("이름,학번,전공,자바,DB,Python>>");
			String name=sc.next();
			if(name.equals("exit")) {
				break;
			}
			int sno=sc.nextInt();
			String major=sc.next();
			
			for(int i=0;i<score.length;i++) {
				score[i]=sc.nextInt();
			}
//			int java=sc.nextInt();
//			int db=sc.nextInt();
//			int python=sc.nextInt();
			aStudent.add(new Student(name, sno, major, score));
		}
		rankPro();
}
	static void search() {
		while(true) {
			System.out.println("이름>>");
			String name=sc.next();
			if(name.equals("exit")) {
				break;
			}
			boolean fl=false;
			for(int i=0; i<aStudent.size();i++) {
				Student s = aStudent.get(i);
				if(s.getName().equals(name)) {
					s.display();
					fl=true;
				}
			}
			if(!fl) {
				System.out.println("데이터 없음");
			}
		}
		
		System.out.println("검색 종료");
	}
	static void allshow() {


		for(int i =0;i<aStudent.size();i++) {
			System.out.println(aStudent.get(i));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aStudent=new ArrayList<>();
		sc=new Scanner(System.in);
		boolean fl=false;
		while(true) {
			System.out.println("입력(1), 조회(2), 전체보기(3), 종료(4)");
			int num=sc.nextInt();
			
			switch(num) {
			case 1: input(); break;
			case 2: search(); break;
			case 3: allshow(); break;
			case 4: fl=true; break;
			default: System.out.println("입력 다시");
			}
			if(fl) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
