package kr.taevel.oop;

public class StringTest2 {

    public static void main(String[] args) {
        // String 문자열 추가
        String str = "디미고 ";
        str += "2학년 ";
        str += "5반 ";
        str += "권태훈";

        compareSpeed();
    }

    public static void compareSpeed() {
        long start = System.currentTimeMillis();


        String str = "abc";
        for(int i =0; i < 100000; i++) {
            str += "def";
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }

}
