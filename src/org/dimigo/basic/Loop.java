package org.dimigo.basic;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        // 1. for문
        // 구구단 출력하기
        int m = 1, n = 1;
        for (int i = m; i < 10; i++) {
            for (int j = n; j < 10; j++) {
                System.out.printf("%d*%d=%d ", i, j, i*j);
            }
            System.out.println();
        }

        // 2. for-each문
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }

        // intranet
        String[] intranet = {"dimigoin", "coin_judge", "dimigo_life", "dimigo.hs.kr"};
        for (String i : intranet) {
            System.out.println(i);
        }

        // while, do-while
        // 메뉴 처리
        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println("<< 간식 선택 >>");
            System.out.println("<< 1. 치킨 >>");
            System.out.println("<< 2. 피자 >>");
            System.out.println("<< 3. 햄버거 >>");
            System.out.println("<< 9. 종료 >>");
            System.out.print("메뉴 선택 =>");
            scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("치킨이닭");
                    break;
                case 2:
                    System.out.println("피자아");
                    break;
                case 3:
                    System.out.println("햄버거엉");
                    break;
                case 9:
                    System.out.println("종료오");
                    break;
                default:
                    System.out.println("뭐야 넌?");
            }
        } while (menu != 9);
    }

}