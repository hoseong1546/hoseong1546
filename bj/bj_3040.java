package com.ssafy.bj;
import java.util.Scanner;

public class bj_3040 {
	static int N,R;
	static int[] numbers;
	public static void main(String[] args) {
		N=9;
		R=7;
		int[] arr = new int[N];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<N; i++) 
			arr[i] = sc.nextInt();
		numbers= new int[R];
		조합(0,0,arr);
		sc.close();
	}
	private static void 조합(int start, int cnt, int[] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		if(cnt==R) {
			for(int i : numbers)
				sum+=i;
			if(sum==100)
				for(int i : numbers)
					System.out.println(i);
			return;
		}
		for(int i=start;i<N;i++) {
			numbers[cnt] = arr[i];
			조합(i+1,cnt+1,arr);
		}
	}
}
