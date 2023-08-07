package com.ssafy.bj;

import java.util.Scanner;

public class bj_14696 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		boolean a = true;
		for(int q=0; q<T; q++) {
			
			int A = sc.nextInt();
			int[] Aarr = new int[A];
			for(int i = 0; i<A; i++)
				Aarr[i] = sc.nextInt();
			
			int B = sc.nextInt();
			int[] Barr = new int[B];
			for(int i = 0; i<B; i++)
				Barr[i] = sc.nextInt();
			
			for(int i=4; i>=0; i--) {
				if(find(i,Aarr) > find(i,Barr)) {
					System.out.println("A");
					a=false;
					break;
				}
				else if(find(i,Aarr) < find(i,Barr)) {
					System.out.println("B");
					a=false;
					break;
				}
			}
			if(a)
				System.out.println("D");
			a = true;
		}
		sc.close();
	}

	private static int find(int n, int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == n)
				count++;
		}
		return count;
	}
}
