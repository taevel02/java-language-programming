package kr.taevel.java;

import java.util.Random;

public class Condition {

    public static void main(String[] args) {
        // 1. if-else
        int age = 17;

        // 19세 이상이면 "투표하러 가세요"
        // 아니면 "선거권이 없네요"

        if (age >= 19) {
            System.out.println("투표하러 가세요");
        } else {
            System.out.println("선거권이 없네요");
        }

        // 2. switch
        // 주사위 랜덤 뽑기 (1~6)
        int num = new Random().nextInt(6) + 1;
        switch (num % 2) {
            case 0:
                System.out.println(num + " 짝수입니다");
                break;

            case 1:
                System.out.println(num + " 홀수입니다");
                break;

            default:
                System.out.println("Error");
                break;
        }

        // 햄버거 사주세요
        String menu = "햄버거";
        switch (menu) {
            case "햄버거":
                System.out.println("햄버거 사주세요");
                break;

            default:
                System.out.println("난 햄버거 싫어");
                break;
        }

    }

}
