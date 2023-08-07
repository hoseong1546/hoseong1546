package com.ssafy.swea;

import java.util.Scanner;

public class swea_13428 {
	static int max,min,N,R,numbers[];
	static char arr[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			arr = sc.next().toCharArray();
			N=arr.length;
			R=2;
			max=Integer.parseInt(new String(arr));		// 초기값 기본값으로 설정
			min=Integer.parseInt(new String(arr));		// "
			numbers=new int[2];							// N : 배열길이, R : 2  ( 즉 숫자배열에서 2개를 뽑아 바꾸는 모든 조합 찾기 )
			조합(0,0);
			System.out.println("#" + tc + " " +min + " " + max);
		}
		sc.close();
	}
	private static void 조합(int start, int cnt) {
		char c;
		int ar=Integer.parseInt(new String(arr));;
		if(cnt == R) {
			char arr2[] = new char[arr.length];
			for(int i=0; i<arr.length; i++)
				arr2[i] = arr[i];
			c = arr2[numbers[0]];						//담겨진 모든 경우를 c를 이용하여 바꾸기
			arr2[numbers[0]] = arr2[numbers[1]];
			arr2[numbers[1]] = c;
			if(arr2[0] != '0')
				ar = Integer.parseInt(new String(arr2));			//바꾼 값의 첫 값이 0이 아닐경우 숫자로 변환하여 비교
			if(arr2[0] != 0 && ar < min)
				min = ar;
			else if(ar > max)
				max = ar;
			return;
		}
		for(int i=start; i<N; i++) {
			numbers[cnt]=i;			//N개중 2개의 조합의 모든 경우를 numbers 배열에 담음
			조합(i+1,cnt+1);
		}
	}
}
