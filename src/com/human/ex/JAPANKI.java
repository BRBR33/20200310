package com.human.ex;

import java.util.Scanner;

public class JAPANKI {
	public static void main(String[] args) {

		// 자판기
		// 메뉴
		// 남은돈 0원.
		// 1.사이다 700 2.콜라 500 3.환타 350 4.반환 5.투입

		// 사나리오
		// 천원짜리 세장 넣고 사이다1개 콜라2개 환타1개 를 구매한다.

		// 출력결과
		// 사이다 콜라 콜라 환타 천원짜리 0개 오백원짜리 1개 백원짜리 4개 오십원 1개

		// % 연산자를 사용해서 잔돈 거슬러 주는 프로그램을 먼저 만들어 보자.

		Scanner sc = new Scanner(System.in);
		String inputString = "";
		String money = "";
		int count1 = 0,count2 = 0, count3 = 0, money1 = 0;
		int sprite = 0, coke = 0, hwanta = 0;
		while (!inputString.equals("4")) {
			System.out.println("현재금액 : " + money1);
			System.out.println("메뉴를 선택하세요\n1 : 사이다 (700)\n2 : 콜라 (500)\n" + "3 : 환타 (350)\n4 : 반환\n5 : 투입\n");
			inputString = sc.next();

			switch (inputString) {
			case "1":
				if (money1 >= 700) {
					money1 = money1 - 700;
					System.out.println("음료를 꺼내주세요.");
					sprite++;
				} else {
					System.out.println("금액이 부족합니다.");
				}
				break;
			case "2":
				if (money1 >= 500) {
					money1 = money1 - 500;
					System.out.println("음료를 꺼내주세요.");
					coke++;
				} else {
					System.out.println("금액이 부족합니다.");
				}

				break;
			case "3":
				if (money1 >= 350) {
					money1 = money1 - 350;
					System.out.println("음료를 꺼내주세요.");
					hwanta++;
				} else {
					System.out.println("금액이 부족합니다.");
				}
				break;
			case "4":
				if(money1!=0) {
				int t = money1 / 1000;
				int fh = (money1 % 1000) / 500;
				int h = (money1 % 1000 % 500) / 100;
				int fe = (money1 % 1000 % 500 % 100) / 50;

				String re = String.format("천원 : %d장\n오백원 : %d개\n"
						+ "백원 : %d개\n오십원 : %d개", t, fh, h, fe);

				System.out.println(String.format("구매한 음료수는 사이다 %d개, "
						+ "콜라 %d개, 환타 %d개", sprite, coke, hwanta));
				System.out.println("거스름돈은\n" + re);
				System.out.println("거스름돈을 꺼내주세요.");
				}
				break;
			case "5":
				System.out.println("1000원짜리 지폐나 500원,100원짜리 동전을 투입하세요.\n0을 입력하면 투입이 완료됩니다.");
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
				System.out.println("잘못된 입력입니다.");

			}

		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}
