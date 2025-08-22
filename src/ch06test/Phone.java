package ch06test;

import java.util.Scanner;

import ch06.Product;

public class Phone {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone1[] a=new Phone1[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("이름과 전번");
			String name = sc.next();
			String tel = sc.next();
			a[i]=new Phone1(name,tel);
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].getname()+"의 번호 "+a[i].gettel());
		}
		
	}

}
