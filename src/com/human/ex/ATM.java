package com.human.ex;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputString = "";
		long account = 0l;
		long money = 0l;

		while (!inputString.equals("4")) {
			System.out.println(
					"� ������ ���ðڽ��ϱ�?\n1 : �Ա�\n2 : ���\n" + "3 : ��ȸ\n4 : ����\n");
			inputString = sc.next();

			switch (inputString) {
			case "1":
				System.out.print("������ �־��ּ���. (�ݾ� �Է�)\n");
				money = sc.nextLong();
				account = account + money;
				System.out.println(String.format("���� ���� �ܾ��� %d �� �Դϴ�.\n", account));
				break;
			case "2":
				System.out.print(String.format("���� ���� �ܾ��� %d �� �Դϴ�.\n����� �ݾ��� �Է��ϼ���.\n", account));
				money = sc.nextLong();
			
				if(account<money) {
					System.out.println("�ܾ��� �����մϴ�.");
				}else {
					account = account-money;
					System.out.println(String.format("���� ���� �ܾ��� %d �� �Դϴ�.\n", account));
				}
				break;
			case "3":
				System.out.println(String.format("���� ���� �ܾ��� %d �� �Դϴ�.\n", account));
				break;
			case "4":
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");

			}

		}
		System.out.println("�ȳ��� ���ʽÿ�.");
		sc.close();
	}

}
