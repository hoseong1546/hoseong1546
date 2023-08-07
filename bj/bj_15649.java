package com.ssafy.bj;

import java.util.Arrays;
import java.util.Scanner;

public class bj_15649 {
	static int N,R,numbers[],input[];
	static StringBuilder sb;
	static boolean[] isSelected;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		N = sc.nextInt();
		R = sc.nextInt();
		isSelected = new boolean[N+1];
		sb = new StringBuilder();
		numbers = new int[R];
		input = new int[N];
		for(int i=0; i<N; i++) {
			input[i] = sc.nextInt();
		}
		Arrays.sort(input);
		중복조합(1,0);
		System.out.println(sb.toString());
		sc.close();
	}

	private static void 중복조합(int start, int cnt) {
		if(cnt == R) {
			for(int i : numbers)
				sb.append(i+" ");
			sb.append("\n");
			return;
		}
		for(int i=start; i<=N; i++) {
			numbers[cnt] = input[i-1];
			중복조합(i,cnt+1);
		}
	}
}