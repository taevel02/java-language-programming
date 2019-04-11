package kr.taevel.oop;

public class ArrayBasic {

    public static void main(String[] args) {
        // 기본형 : int long double char float boolean short ...
        // 참조형 : String Book Car Scanner Random StringBuilder ...
        Book book = null;
        Car car = null;

        int[] intArr = null;
        intArr = new int[5];

        // printArray(intArr);

        // double타입 5개
        double[] doubleArr = null;
        doubleArr = new double[5];
        for (double valuec : doubleArr) {
            System.out.println(valuec);
        }
        System.out.println();

        int[] intArr2 = {1, 2, 3, 4, 5};
        int[] intArr3 = {1, 2, 3, 4, 5};

        // printArray(intArr2);

        // 참조형베열

        String[] strArr = new String[3];
        printArrayS(strArr);  // 메소드는 똑같고 타입 매개변수가 틀리니 오버로딩이 일어남


        strArr[0] = "BTS";
        strArr[1] = "BTS1";
        strArr[2] = "BTS2";
        // strArr[3] = "TEST";  벗어나는 범위
        printArrayS(strArr);


        String[] strArr2 = {"BTS", "BTS1", "BTS2"};
        String[] strArr3 = new String[]{"BTS", "BTS1", "BTS2"};
        printArrayS(strArr2);

        // Book 타입 2개짜리 배열 생성
        // 각 방에 Book 객체 생성 후 출력
        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("에고는 적이다", "???", 300);
        bookArr[1] = new Book("나는 4시간만 일한다", "???", 300);
        printArray(bookArr);

        Book[] bookArr2 = { new Book("에고는 적이다", "???", 300), new Book("나는 4시간만 일한다", "???", 300) };
        printArray(bookArr2);

        // 배열 사용 시 주의사항
        int[] intArr4 = null;
        // System.out.println(intArr4.length);

        intArr4 = new int[3];
        // System.out.println(intArr4.length);

        String[] strArr4 = new String[3];
        // System.out.println(strArr4.length);

        Book[] bookArr3 = new Book[3];
        // System.out.println(bookArr3.getTitle());
    }

    private static void printArray(Book[] bookArr) {
        for (Book value : bookArr) {
            System.out.println(value.toString());
        }
        System.out.println();
    }

    private static void printArrayS(String[] strArr) {
        for (String value : strArr) {
            System.out.println(value);
        }
        System.out.println();
    }
}

