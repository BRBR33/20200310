package com.human.ex;

import java.util.Scanner;

public class JAPANKI {
	public static void main(String[] args) {

		// ���Ǳ�
		// �޴�
		// ������ 0��.
		// 1.���̴� 700 2.�ݶ� 500 3.ȯŸ 350 4.��ȯ 5.����

		// �糪����
		// õ��¥�� ���� �ְ� ���̴�1�� �ݶ�2�� ȯŸ1�� �� �����Ѵ�.

		// ��°��
		// ���̴� �ݶ� �ݶ� ȯŸ õ��¥�� 0�� �����¥�� 1�� ���¥�� 4�� ���ʿ� 1��

		// % �����ڸ� ����ؼ� �ܵ� �Ž��� �ִ� ���α׷��� ���� ����� ����.

		Scanner sc = new Scanner(System.in);
		String inputString = "";
		String money = "";
		int count1 = 0,count2 = 0, count3 = 0, money1 = 0;
		int sprite = 0, coke = 0, hwanta = 0;
		while (!inputString.equals("4")) {
			System.out.println("����ݾ� : " + money1);
			System.out.println("�޴��� �����ϼ���\n1 : ���̴� (700)\n2 : �ݶ� (500)\n" + "3 : ȯŸ (350)\n4 : ��ȯ\n5 : ����\n");
			inputString = sc.next();

			switch (inputString) {
			case "1":
				if (money1 >= 700) {
					money1 = money1 - 700;
					System.out.println("���Ḧ �����ּ���.");
					sprite++;
				} else {
					System.out.println("�ݾ��� �����մϴ�.");
				}
				break;
			case "2":
				if (money1 >= 500) {
					money1 = money1 - 500;
					System.out.println("���Ḧ �����ּ���.");
					coke++;
				} else {
					System.out.println("�ݾ��� �����մϴ�.");
				}

				break;
			case "3":
				if (money1 >= 350) {
					money1 = money1 - 350;
					System.out.println("���Ḧ �����ּ���.");
					hwanta++;
				} else {
					System.out.println("�ݾ��� �����մϴ�.");
				}
				break;
			case "4":
				if(money1!=0) {
				int t = money1 / 1000;
				int fh = (money1 % 1000) / 500;
				int h = (money1 % 1000 % 500) / 100;
				int fe = (money1 % 1000 % 500 % 100) / 50;

				String re = String.format("õ�� : %d��\n����� : %d��\n"
						+ "��� : %d��\n���ʿ� : %d��", t, fh, h, fe);

				System.out.println(String.format("������ ������� ���̴� %d��, "
						+ "�ݶ� %d��, ȯŸ %d��", sprite, coke, hwanta));
				System.out.println("�Ž�������\n" + re);
				System.out.println("�Ž������� �����ּ���.");
				}
				break;
			case "5":
				System.out.println("1000��¥�� ���� 500��,100��¥�� ������ �����ϼ���.\n0�� �Է��ϸ� ������ �Ϸ�˴ϴ�.");
				do {
					money = sc.next();
					if (money.equals("1000")) {
						count1++;
					}else if(money.equals("500")) {
						count2++;
					}else if(money.equals("100")) {
						count3++;
					}
				} while (money.equals("1000")||money.equals("500")||money.equals("100"));
				if (money1 == 0) {
					money1 = count1 * 1000 + count2 * 500 + count3 * 100;
					count1 = 0;
					count2 = 0; 
					count3 = 0;
				} else {
					money1 = money1 + count1 * 1000 + count2 * 500 + count3 * 100;
					count1 = 0;
					count2 = 0; 
					count3 = 0;
				}
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");

			}

		}
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
	}

}
