package com.ssafy.bj;

import java.util.Scanner;

public class bj_2567 {
	public static void main(String[] args) {
		int [][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};
		int[][] arr = new int[101][101];
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr2 = new int[2];
		int c=0;
		for(int i=0; i<T; i++) {
			arr2[0] = sc.nextInt();
			arr2[1] = sc.nextInt();
			for(int j = 0; j < 10; j++)
				for(int k = 0; k < 10; k++)
					arr[arr2[0]+j][arr2[1]+k] = 1;
		}
		for(int k = 1; k < 101; k++) { 
			for(int l = 1; l < 101; l++) {
				if(arr[k][l] == 1) {
					for(int dir[] : dirs) {
						if(arr[k+dir[0]][l+dir[1]] == 0)
							c++;
					}
				}
			}
		}
		System.out.print(c);
		sc.close();
	}
}
