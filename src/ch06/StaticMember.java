package ch06;

import java.util.Scanner;

public class StaticMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("환율 1달러>>");
		double rate=sc.nextDouble();
		CurrencyCbt.setRate(rate);
		System.out.println("백만원은 $"+CurrencyCbt.toDollar(1000000)+"입니다.");
		System.out.println("$100는 "+CurrencyCbt.tokwr(100)+"원입니다.");
		sc.close();
	}

}
