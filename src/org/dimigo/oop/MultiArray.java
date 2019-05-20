package org.dimigo.oop;

public class MultiArray {

    public static void main(String[] args) {
        // int 타입 이차원 배열
        int[][] intArr = new int[2][3];
        printArray(intArr);

        // String 타입 이차원 배열
        String[][] strArr = new String[2][];
        strArr[0] = new String[3];
        strArr[1] = new String[2];
        strArr[0][0] = "javascript";
        strArr[0][1] = "react.js";
        strArr[0][2] = "vue.js";
        strArr[1][0] = "css";
        strArr[1][1] = "sass";
        printArrayString(strArr);

        String[][] strArr2 = {
            {"C", "C++", "Java"},
            {"PHP", "C#"}
        };
    }

    private static void printArray(int[][] intArr) {
//        for (int i = 0; i < intArr.length; i++) {
//            for (int j = 0; j < intArr.length; j++) {
//                System.out.println(intArr[i][j] + " | ");
//            }
//            System.out.println();
//        }

        for (int[] arr : intArr) {
            for (int value : arr) {
                System.out.println(value);
            }
            System.out.println();
        }
    }

    private static void printArrayString(String[][] strArr) {
        for (String[] arr : strArr) {
            for (String value : arr) {
                System.out.println(value);
            }
            System.out.println();
        }
    }

}
