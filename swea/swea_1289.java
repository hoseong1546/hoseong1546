package com.ssafy.swea;

import java.util.Scanner;

public class swea_1289 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int q=0; q<t; q++) {
			String str = sc.next();
			int c = 0;
			char[] arr = str.toCharArray();
			char ch = '0';
			for(int i =0;i<arr.length;i++) {
				if(arr[i] != ch) {
					c++;
					ch=arr[i];
				}
			}
			System.out.println("#" + (q+1) + " " + c);
		}
		sc.close();
	}
}
