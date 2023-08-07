package com.ssafy.swea;

import java.util.Scanner;

public class swea_1220 {
	public static void main(String[] args) {
		int N=100,T=10;
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[N][N];
		for(int q=0;q<T;q++) {
			sc.nextInt();
			for(int i=0; i<N; i++)
				for(int j=0; j<N; j++) 
					arr[i][j] = sc.nextInt();
			int dead=0,cur=1;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(arr[j][i] == cur) {
						if(cur==1)
							cur=2;
						else {
							cur=1;
							dead++;
						}
					}
				}
				cur=1;
			}
			System.out.println("#" + (q+1) + " " + dead);
			dead=0;
		}
		sc.close();
	}
}
