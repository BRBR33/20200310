package com.human.ex;

import java.util.Scanner;

public class quiz02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String color = "����";
		int brightness = 50;
		while (true) {
			System.out.print("color�� �Է��ϼ���: ");
			String colorInput = sc.next();
			System.out.print("brightness�� �Է��ϼ���: ");
			int brightnessInput = sc.nextInt();
			if(brightnessInput == brightness+1 || brightnessInput == brightness-1) {
				System.out.println("���� ������ " + colorInput + ", ���� " + brightnessInput + " �Դϴ�.\n");
				brightness = brightnessInput;
			} else {
				System.out.println("���� 1���� ������ �����մϴ�.\n");
			}
		}
		
	}
	
}
