package com.ssafy.swea;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class swea_1225 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Queue<Integer> q = new LinkedList<Integer>();	//시간복잡도ㅊ 최적화 위해 queue 사용
		for(int w=1; w<=10; w++) {
			int c=1;	//증가할 변수 ( 6이되면 1로 초기화됨 )
			int x=0;
			sc.next();	// 테스트케이스 번호 버리기
			for(int e=0; e<8; e++)	//8개의 숫자 q에 담기
				q.add(sc.nextInt());
			
			while(true) {
				x=q.poll()-c;	// q에서 꺼낸 숫자에서 c(1~5)만큼 뺀 값 저장
				if(x>0)
					q.add(x);	// 값을 검사해서 0보다 크면 저장, 작으면 0으로 바꾸고 저장후 종료
				else {
					q.add(0);
					break;
				}
				c++;
				if(c==6)
					c=1;
			}
			System.out.print("#" + w + " ");
			for(int i = 0;i<8;i++) 
				System.out.print(q.poll() + " ");
			System.out.println();
			
		}
		sc.close();
	}
}