package com.ssafy.bj;

import java.util.Scanner;

public class bj_1244 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		for(int i = 0; i<T; i++) {
			arr[i] = sc.nextInt();
		}
		int K = sc.nextInt();
		for(int j=0; j<K; j++) {
			int s = sc.nextInt();
			int index = sc.nextInt();
			int c = T/index;
			
			if(s==1) {
				for(int k=1; k<=c; k++) {
					if(arr[index*k-1]==1)
						arr[index*k-1] = 0;
					else
						arr[index*k-1] = 1;
				}
			}
			else {
				int i = 0;
				if(arr[index-1-i]==1)
					arr[index-1-i]=0;
				else
					arr[index-1-i]=1;
				while(arr[index-i-1] == arr[index+i-1]) {
					if(arr[index-1-i]==1)
						arr[index-1-i]=0;
					else
						arr[index-1-i]=1;
					if(arr[index-1+i]==1)
						arr[index-1+i]=0;
					else
						arr[index-1+i]=1;
					i++;
					if(index-1-i < 0 || index-1+i==T)
						break;
				}
			}
			
		}
		for(int i=0; i<arr.length; i++) {
			if(i%20==0 && i!=0)
				System.out.println();
			if(i!=arr.length-1 || i%20==0)
				System.out.print(arr[i]+" ");
			else
				System.out.print(arr[i]);
		}
		sc.close();
	}
}