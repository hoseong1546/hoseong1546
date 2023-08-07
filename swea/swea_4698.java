package com.ssafy.swea;

import java.util.Scanner;

public class swea_4698 {
	public static void main(String[] args) {
		int[] PN = new int[1000001];
		에라토스테네스의체(PN);
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int q=1; q<=T; q++) {
			int D = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			int count = 0;
			for(int i=A; i<=B; i++) {
				if(PN[i]!=0 && (PN[i]+"").contains(D+""))
					count++;
			}
			System.out.println("#" + q + " "  + count);
			count=0;
		}
		sc.close();
	}

	private static void 에라토스테네스의체(int[] PN) {
		for(int i = 2; i<PN.length; i++)
			PN[i] = i;
		
		for(int i=2; i<PN.length; i++) {
			if(PN[i]==0)	continue;
			for(int j=i*2; j<PN.length; j+=i) 
				PN[j] = 0;
		}
	}
}
