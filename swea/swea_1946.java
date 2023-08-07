package com.ssafy.swea;

import java.util.Scanner;

public class swea_1946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int q=0;q<t;q++) {
			StringBuilder sb = new StringBuilder();
			int count = 1;
			int N = sc.nextInt();
			for(int w=0; w<N; w++) {
				String c = sc.next();		//입력할 알파벳을 c에 저장
				int k = sc.nextInt();
				for(int i=0; i<k; i++) {		//k개만큼 알파벳 입력
					sb.append(c);
					count++;
					if(count>10) {		//10개차면 줄넘김
						count=1;
						sb.append("\n");
					}
				}
			}
			System.out.println("#" + (q+1));
			System.out.println(sb.toString());
		}
		sc.close();
	}
}
