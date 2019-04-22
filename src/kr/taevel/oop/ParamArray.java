package kr.taevel.oop;

public class ParamArray {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        add(intArr, 10);
        printArray(intArr);

        String[] names = {"권태훈", "이동준", "권보성", "박태훈"};
        changeName(names, "김");
        printArrayString(names);
    }

    private static void printArray(int[] intArr) {
        for (int value : intArr) {
            System.out.println(value);
        }
    }

    private static void printArrayString(String[] names) {
        for (String value : names) {
            System.out.println(value);
        }
    }

    private static void add(int[] intArr, int num) {
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] += num;
        }
    }

    private static void changeName(String[] names, String familyName) {
        for (int i = 0; i < names.length; i++) {
            names[i] = familyName + names[i].substring(1);
        }
    }

}
