package com.ssafy.bj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		int[] arr = new int[T];
		int[] sum = new int[T];
		int x,y;
		str = br.readLine().split(" ");
		for(int q=0; q<T; q++)
			arr[q] = Integer.parseInt(str[q]);
		sum[0] = arr[0];
		for(int q=1; q<T; q++)
			sum[q] = sum[q-1] + arr[q];
		for(int q=0; q<M; q++) {
			str = br.readLine().split(" ");
			x = Integer.parseInt(str[0]);
			y = Integer.parseInt(str[1]);
			sb.append((sum[y-1] - sum[x-1] + arr[x-1])+"\n");
		}
		System.out.println(sb.toString());
	}
}