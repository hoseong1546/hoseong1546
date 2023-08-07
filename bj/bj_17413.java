package com.ssafy.bj;

import java.util.Scanner;

public class bj_17413 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		StringBuilder ans = new StringBuilder();
		boolean b = true;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '<') {
				if(sb.length()!=0) {
					sb.reverse();
					ans.append(sb);
					sb = new StringBuilder();
				}
				ans.append(str.charAt(i));
				b=false;
			}
			else if(str.charAt(i) == ' ') {
				if(sb.length()!=0) {
					sb.reverse();
					ans.append(sb);
					sb = new StringBuilder();
				}
				ans.append(str.charAt(i));
			}
			else if(str.charAt(i) == '>') {
				b=true;
				ans.append(str.charAt(i));
			}
			else if(b)
				sb.append(str.charAt(i));
			else
				ans.append(str.charAt(i));
		}
		if(sb.length()!=0) {
			sb.reverse();
			ans.append(sb);
		}
		System.out.println(ans.toString());
		sc.close();
	}
}

