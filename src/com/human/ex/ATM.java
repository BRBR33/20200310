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
					"어떤 업무를 보시겠습니까?\n1 : 입금\n2 : 출금\n" + "3 : 조회\n4 : 종료\n");
			inputString = sc.next();

			switch (inputString) {
			case "1":
				System.out.print("현금을 넣어주세요. (금액 입력)\n");
				money = sc.nextLong();
				account = account + money;
				System.out.println(String.format("현재 계좌 잔액은 %d 원 입니다.\n", account));
				break;
			case "2":
				System.out.print(String.format("현재 계좌 잔액은 %d 원 입니다.\n출금할 금액을 입력하세요.\n", account));
				money = sc.nextLong();
			
				if(account<money) {
					System.out.println("잔액이 부족합니다.");
				}else {
					account = account-money;
					System.out.println(String.format("현재 계좌 잔액은 %d 원 입니다.\n", account));
				}
				break;
			case "3":
				System.out.println(String.format("현재 계좌 잔액은 %d 원 입니다.\n", account));
				break;
			case "4":
				break;
			default:
				System.out.println("잘못된 입력입니다.");

			}

		}
		System.out.println("안녕히 가십시오.");
		sc.close();
	}

}
