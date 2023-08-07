package com.ssafy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11660 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(str[0]);
		int T = Integer.parseInt(str[1]);
		int[][] sum = new int[N][N];
		int[][] arr = new int[N][N];
		int x1,y1,x2,y2;
		for(int i=0; i<N; i++) {
			str = br.readLine().split(" ");
			for(int j=0; j<N; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		sum[0][0] = arr[0][0];
		for(int i=1; i<N; i++) {
			sum[0][i] = sum[0][i-1] + arr[0][i];
			sum[i][0] = sum[i-1][0] + arr[i][0];
		}
		for(int i=1; i<N; i++)
			for(int j=1; j<N; j++)
				sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + arr[i][j];
		
		int ans = 0;
		for(int i=0; i<T; i++) {
			str = br.readLine().split(" ");
			y1 = Integer.parseInt(str[0])-1;
			x1 = Integer.parseInt(str[1])-1;
			y2 = Integer.parseInt(str[2])-1;
			x2 = Integer.parseInt(str[3])-1;
			if(y1!=0 && x1!=0)
				ans = sum[y2][x2] - sum[y2][x1-1] - sum[y1-1][x2] + sum[y1-1][x1-1];
			else if(y1==0 && x1==0)
				ans = sum[y2][x2];
			else if(x1==0)
				ans = sum[y2][x2] - sum[y1-1][x2];
			else
				ans = sum[y2][x2] - sum[y2][x1-1];
			
			sb.append(ans+"\n");
			ans=0;
		}
		System.out.println(sb.toString());
	}
}