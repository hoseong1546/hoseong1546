package com.ssafy.swea;

import java.util.Arrays;
import java.util.Scanner;

public class swea_2817 {
	static int Factorial(int n) {	//팩토리얼(n!)
		int f = 1;
		while(n>1) {
			f*=n;
			n--;
		}
		return f;
	}
	static int[] numbers,arr;
	static boolean[] isSelected;
	static int N,K,count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int q=0; q<t; q++) {
			N = sc.nextInt();
			arr = new int[N];
			K = sc.nextInt();
			for(int w=0; w<N; w++) 
				arr[w] = sc.nextInt();
			
			Arrays.sort(arr);
			int sum=0,c=0;
			for(int i=0; i<arr.length; i++) {
				sum+=arr[i];
				if(sum >= K) {
					c=i;
					break;
				}
			}
			
			for(int R = 2; R<=c; R++) {
				isSelected = new boolean[N];
				numbers = new int[R];
				perm(0,0,R);
			}
			System.out.println("#" + (q+1) + " " + count);
		}
		sc.close();
	}
	static int sum=0;
	private static void perm(int cnt, int start, int R) {
		if(cnt == R) {
//			System.out.println(Arrays.toString(numbers));
			for(int i : numbers)
				sum+=i;
			if(sum==K)
				count++;
			sum=0;
			return;
		}
		for(int i=start; i<N; i++) {
			numbers[cnt] = arr[i];
			perm(cnt+1,i+1,R);
		}
	}
}
