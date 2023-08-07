package com.ssafy.bj;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class bj_2164 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> que = new LinkedList<>();
		for(int i=1; i<=N; i++)
			que.add(i);
		for(int i=N; i>1; i--) {
			que.poll();
			que.add(que.poll());
		}
		System.out.println(que.poll());
		sc.close();
	}
}
