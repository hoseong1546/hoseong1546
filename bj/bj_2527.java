package com.ssafy.bj;

import java.util.Scanner;	//								|-----------x2y2			|-----------a2b2
							//								|			|           	|			|   
public class bj_2527 {		//								|			|           	|			|   
	public static void main(String[] args) {			///x1y1---------|			///a1b1---------|	
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			int x1,x2,y1,y2,a1,a2,b1,b2;
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			a1 = sc.nextInt();
			b1 = sc.nextInt();
			a2 = sc.nextInt();
			b2 = sc.nextInt();
			if(x1 == a2 && y1 == b2 || x1 == a2 && y2 == b1 || x2 == a1 && y1 == b2 || x2 == a1 && y2 == b1)
				System.out.println('c');
			else if(y1 == b2 && x1 <= a1 && x2 > a1||
					y1 == b2 && x1 < a2 && x2 >= a2||
					x2 == a1 && y1 < b2 && y2 >= b2||
					x2 == a1 && y1 <= b1 && y2 > b1||
					y2 == b1 && x1 <= a1 && x2 > a1||
					y2 == b1 && x1 < a2 && x2 >= a2||
					x1 == a2 && y1 <= b1 && y2 > b1||
					x1 == a2 && y1 < b2 && y2 >= b2||
					
					y1 == b2 && a1 < x1 && a2 > x2||
					y2 == b1 && a1 < x1 && a2 > x2||
					x1 == a2 && b1 < y1 && b2 > y2||
					x2 == a1 && b1 < y1 && b2 > y2)
				System.out.println('b');
			else if(b2 < y1 || x2 < a1 || y2 < b1 || a2 < x1)
				System.out.println('d');
			else
				System.out.println('a');
			}
		sc.close();
	}
}
