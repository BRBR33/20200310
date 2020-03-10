package com.human.ex;

import java.util.Scanner;

public class quiz02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String color = "빨강";
		int brightness = 50;
		while (true) {
			System.out.print("color를 입력하세요: ");
			String colorInput = sc.next();
			System.out.print("brightness를 입력하세요: ");
			int brightnessInput = sc.nextInt();
			if(brightnessInput == brightness+1 || brightnessInput == brightness-1) {
				System.out.println("현재 색상은 " + colorInput + ", 밝기는 " + brightnessInput + " 입니다.\n");
				brightness = brightnessInput;
			} else {
				System.out.println("밝기는 1씩만 조절이 가능합니다.\n");
			}
		}
		
	}
	
}
