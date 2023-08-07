package com.ssafy.swea;

import java.util.Scanner;

public class swea_5356 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int Q=1; Q<=T; Q++) {
			StringBuilder sb = new StringBuilder();
			String[] str = new String[5];
			int max=0;
			for(int i =0; i<5; i++) { 
				str[i] = sc.next();
				if(str[i].length() > max)
					max = str[i].length();
			}
			for(int i=0; i<max; i++)
				for(int j=0; j<5; j++) {
					if(!(str[j].length()-1 < i))
					sb.append(str[j].charAt(i));
				}
			
			System.out.println("#" + Q + " " + sb.toString());
		}
		sc.close();
	}
}
