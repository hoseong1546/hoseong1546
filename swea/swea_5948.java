package com.ssafy.swea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class swea_5948 {
	static int N=7,R=3,numbers[],arr[];
	static List<Integer> al;
	static HashSet<Integer> hs;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			hs = new HashSet<>();	//집합으로 중복 제거
			arr = new int[N];
			numbers = new int[R];
			for(int i=0; i<N; i++)
				arr[i] = sc.nextInt();
			조합(0,0);
			al = new ArrayList<Integer>(hs);
			Collections.sort(al,Collections.reverseOrder());
			System.out.println("#" + tc + " " + al.get(4));	//5번째 큰 수
		}
		sc.close();
	}
	private static void 조합(int start, int cnt) {		//7개중에 3개 선택( 조합 )
		int sum=0;
		if(cnt == R) {
			for(int i=0; i<R; i++)
				sum+=numbers[i];
			hs.add(sum);
			return;
		}
		for(int i=start; i<N; i++) {
			numbers[cnt] = arr[i];
			조합(i+1, cnt+1);
		}
	}
}
