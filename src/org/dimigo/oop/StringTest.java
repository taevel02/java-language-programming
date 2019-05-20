package org.dimigo.oop;

public class StringTest {

    public static void main(String[] args) {
        // 1.문자열 리터럴 방식
        String dog1 = "멍멍이";
        String dog2 = "멍멍이";
        System.out.println(dog1 == dog2);

        // 2. new 객채 생성 방식
        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이");
        System.out.println(cat1 == cat2);

        // 문제
        System.out.println(dog1 == " 멍멍이");
        System.out.println(cat1 == "야옹이");


        // equlas 는 문자열 자체가 같나 확인하는것
        System.out.println(dog1.equals(dog2));
        System.out.println(cat1.equals(cat2));

        String id = "admin";
        // id가 어드민이면 관리자입니다 출력 아니면 아니라고 출력

        if (id.equals("admin")) { // 이거대신 "admin".equals(id)면 널체크까지 가능
            System.out.println("어드민입니다");
        } else {
            System.out.println("어드민이 아닙니다");
        }

        // 대문자 무시
        if ("Admin".equalsIgnoreCase(id)) {
            System.out.println("어드민입니다");
        } else {
            System.out.println("어드민이 아닙니다");
        }


        tesString();
    }

    private static void tesString() {
        // 01234567890123
        String s = "abcdefgABCDEFG";
        System.out.println(s.length()); // 문자열길이
        System.out.println(s.substring(3));  // d부터출력
        System.out.println(s.substring(3, 7)); // defg출력
        System.out.println(s.indexOf(9)); // C->9
        System.out.println(s.charAt(9)); // 9->c
        System.out.println(s.concat("ABC")); // a~GABC
        System.out.println("        ABC      ".trim()); //스페이스바 제거
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.replace('a', 'A')); // 문자변환
        System.out.println(s.startsWith("abc"));   // ~로 시작하냐
        System.out.println(s.endsWith("FG")); // ~로 끝나냐

    }
}
