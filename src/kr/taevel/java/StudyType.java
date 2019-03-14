package kr.taevel.java;

public class StudyType {

    public static void main(String[] args) {
        // 문자
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';
        System.out.printf("%c %c %c\n", c1, c2, c3);
        System.out.println('붥');

        // 문자열
        String name = "권태훈";
        System.out.println(name);

        // 정수형
        int i1 = 10;
        int i2 = 0b00001010;
        int i3 = 012;
        int i4 = 0x0A;
        System.out.printf("%d %d %d %d\n", i1, i2, i3, i4);

        // 바이트
        byte b1 = -128; // 최소
        byte b2 = 127; // 최대
        System.out.println(b1);
        System.out.println(b2);

        b1--; // 127
        b2++; // -128

        System.out.println(b1);
        System.out.println(b2);

        // 정수의 범위
        System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + "~" + Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + "~" + Long.MAX_VALUE);

        // 100억을 저장하려면? (0이 10개)
        long a = 10000000000L;

        // 실수형
        float f1 = 3.14f;
        double d1 = 3.14;
        System.out.printf("%.2f, %.2f\n", f1, d1);

        // 실수는 정밀도가 중요
        float f2 = 0.12345678901234567890f;
        double d2 = 0.12345678901234567890;
        System.out.println(f2);
        System.out.println(d2);

        System.out.printf("%c %d %f %s\n", 'A', 100, 12.345, "아이유");
    }

}
