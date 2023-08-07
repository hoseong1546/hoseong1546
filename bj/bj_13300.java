package com.ssafy.bj;

import java.util.Scanner;

public class bj_13300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int K = sc.nextInt();
		double[][] arr = new double[2][7];
		int ans=0;
		for(int q=0;q<T;q++) 
			arr[sc.nextInt()][sc.nextInt()]++;
		
		for(int i=0;i<2;i++) {
			for(int j=1;j<=6;j++) {
				if(arr[i][j] == 0)	continue;
				else
					ans += Math.ceil(arr[i][j]/K);
			}
		}
		System.out.println(ans);
		ans=0;
		sc.close();
	}
}
