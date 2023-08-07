package com.ssafy.swea;

import java.util.Scanner;

public class swea_7510 {	//프로그래머스 - 숫자의 표현
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int N = sc.nextInt();
			int sum=0, i=0, answer=0;		//ex) N이 15일때 1+2+3+4+5 최대 5가지 수의 합으로 이루어 질 수 있음
			while(N > sum+i) {
				i++;
				sum+=i;
			}
			while(i!=0) {					
				if((N-sum)%i==0)		// ex) N이 15일때 N을 5자리수의 합으로 나타내면 5x+10 = 15 -> 따라서 5x = 5; x=1; 연속된 자연수의 합이어야 하므로 x는 i로 나누어 떨어져야 한다(자연수).
					answer++;
				sum-=i;
				i--;
			}
			System.out.println("#" + tc + " " + answer);
		}
		sc.close();
	}
}
