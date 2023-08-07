package com.ssafy.bj;

import java.util.Scanner;

public class bj_2961 {
	static int T;
	static boolean p = false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] Sin;
		int[] Tsn;
		T = sc.nextInt();
		Sin = new int[T];
		Tsn = new int[T];
		
		for(int q=0; q<T; q++) {
			Sin[q] = sc.nextInt();
			Tsn[q] = sc.nextInt();
		}
		System.out.println(부분조합바이너리(Sin, Tsn, 1, 0));
		sc.close();
	}
	private static int 부분조합바이너리(int[] arr1,int[] arr2, int mat1, int mat2) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		int ans=0;
		for(int i=1; i<(1<<T); i++) {
			for(int j=0; j<=T/2+1; j++) {
				if((i & 1<<j) != 0) {
					mat1*=arr1[j];
					mat2+=arr2[j];
					p = true;
				}
			}
			if(p)
				ans = Math.abs(mat1-mat2);
			if(ans < min)
				min = ans;
			mat1 = 1;
			mat2 = 0;
			p = false;
		}
		return min;
	}
}