package com.ssafy.bj;
import java.util.Scanner;

public class bj_10163 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[][] arr = new int[1001][1001];
		int a=1;
		int c=0;
		for(int q =0; q<T; q++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int w = sc.nextInt();
			int h = sc.nextInt();
			for(int i=y; i<y+h; i++)
				for(int j=x; j<x+w; j++)
					arr[i][j] = a;
			a++;
		}
		for(int k=1; k<a; k++) {
			for(int i=0; i<1001; i++)
				for(int j=0;j<1001;j++)
					if(arr[i][j]==k)
						c++;
			System.out.println(c);
			c=0;
		}
		sc.close();
	}
}
