package com.human.ex;

import java.util.Scanner;
public class quiz3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		for(int i=1;i<11;i++) {
			
			System.out.print("숫자입력:");
			int a = sc.nextInt();
			if(a>max) {
				max = a;
			}

		}
		System.out.println(max);
		sc.close();
	}

}
