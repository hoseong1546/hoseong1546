package com.ssafy.swea;

import java.util.Scanner;

public class swea_5432 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		char[] arr;
		for(int Q=1; Q<=T; Q++) {
			arr = sc.next().toCharArray();
			int count = 0;
			int mac = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i] == '(') {
					if(arr[i+1] == ')') {
						count+=mac;
						i++;
					}
					else {
						count++;
						mac++;
					}
				}
				else
					mac--;
			}
			System.out.println("#" + Q + " " + count);
			count=0;
		}
		sc.close();
	}
}
