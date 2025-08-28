package ch09;

import java.util.StringTokenizer;

public class StringToken02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names="홍길동, 김참치,박수박 최서울,,진치킨";
		String[] arr=names.split(", ");
		StringTokenizer st=new StringTokenizer(names,", ",true);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
