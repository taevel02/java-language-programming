package kr.taevel.java;

public class BooleanExample {

    public static void main(String[] args) {
        boolean flag = true;

        if (flag) {
            System.out.println("참입니다!");
        } else {
            System.out.println("거짓입니다!");
        }

        System.out.println(flag ? "참입니다!" : "거짓입니다!");
    }

}
