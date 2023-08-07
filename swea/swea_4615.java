package com.ssafy.swea;

import java.util.Scanner;

public class swea_4615 {		//재미없는 오셀로게임
	static int dirs[][] = {{1,0},{0,1},{-1,0},{0,-1},{1,1},{1,-1},{-1,-1},{-1,1}};	//8방탐색
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] arr = new int[N][N];
			arr[N/2][N/2] = 2;
			arr[N/2-1][N/2-1] = 2;
			arr[N/2-1][N/2] = 1;
			arr[N/2][N/2-1] = 1;		//기본배치 4개 착수
			//m : 세로, n : 가로
			int m,n,myDoll,enemyDoll;
			for(int i=0; i<M; i++) {
				n = sc.nextInt()-1;
				m = sc.nextInt()-1;
				int tempM = m;
				int tempN = n;
				myDoll = sc.nextInt();
				arr[m][n] = myDoll;
				if(myDoll == 1)	enemyDoll = 2;
				else enemyDoll = 1;
				for(int dir[] : dirs) {		//8방탐색 시작
					if(m+dir[0] >= 0 && m+dir[0] < N && n+dir[1] >= 0 && n+dir[1] < N && arr[m+dir[0]][n+dir[1]] == enemyDoll) {		//8방탐색중 상대돌 발견!
						while(true) {																									//상대돌이 어디까지있는지 while로 확인
							m+=dir[0];
							n+=dir[1];
							if(m+dir[0] >= 0 && m+dir[0] < N && n+dir[1] >= 0 && n+dir[1] < N && arr[m+dir[0]][n+dir[1]] == myDoll) {	//상대돌 끝에 내돌이 있으면
								while(arr[m][n] == enemyDoll) {																			//지나온 상대돌들 다 내돌로 변경
									arr[m][n] = myDoll;
									m-=dir[0];
									n-=dir[1];
								}
								m=tempM;																								//내 돌로 변경후 m,n값 초기값으로 되돌리기
								n=tempN;
								break;		//탈출
							}
							else if(m+dir[0] < 0 || m+dir[0] >= N || n+dir[1] < 0 || n+dir[1] >= N || arr[m+dir[0]][n+dir[1]] == 0) {	//상대돌 끝에 내 돌이 없으면 그냥 탈출(헛다리짚었넹~)
								m=tempM;																								//m,n초기값으로 되돌림
								n=tempN;
								break;	//탈출
							}
						}
					}
				}
			}
			int B=0,W=0;
			for(int i[] : arr)
				for(int j : i) {
					if(j == 1)
						B++;
					else if(j==2)
						W++;
				}
			System.out.println("#" + tc + " " + B + " " + W);
		}
		sc.close();
	}
}