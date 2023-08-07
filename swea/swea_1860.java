package com.ssafy.swea;

import java.util.PriorityQueue;
import java.util.Scanner;

public class swea_1860 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int Q=1; Q<=T; Q++) {
			boolean p = false;	//possible or impossible
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();		//우선순위큐 ( 가장 작은값부터 poll 함 )
			for(int w=0;w<N; w++)
				pq.add(sc.nextInt());
			int x,time = M;
			while(true) {
				if(!pq.isEmpty())
					x = pq.poll();	// 1명 뽑아서 이사람이 받을 수 있는지 확인
				else {
					p = true;
					break;
				}
				if(x < time)
					break;
				time+=M;		//time(M)만큼 시간이 지나면
				for(int i=0;i<K-1;i++) {		//K-1명을 Poll 함 : K-1인 이유는 위에서 검사할때 1명 뻇기 떄문  
					if(!pq.isEmpty())
						pq.poll();
					else {
						p = true;
						break;
					}
				}
				if(p)
					break;
			}
			
			if(p)	System.out.println("#" + Q + " Possible");
			else	System.out.println("#" + Q + " Impossible");
		}
		sc.close();
	}
}