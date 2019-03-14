package kr.taevel.java;

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
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
