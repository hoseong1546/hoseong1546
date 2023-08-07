package com.ssafy.swea;

import java.util.Scanner;

public class swea_1220_2 {
	public static void main(String[] args) {
		int N=100,T=10;
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[N];
		for(int q=0;q<T;q++) {
			sc.nextInt();
			int dead=0,x,i=0;
				for(int j=0; j<N*N; j++) {
					x = sc.nextInt();
					if(arr[i] == true && x==2) {
						arr[i] = false;
						dead++;
					}
					arr[i] = (x == 1 || (arr[i] == true && x==0)) ? true : false;
					i++;
					if(i==100) i=0;
				}
			System.out.println("#" + (q+1) + " " + dead);
			dead=0;
			for(int j=0; j<N; j++)	arr[j]=false;
		}
		sc.close();
	}
}
