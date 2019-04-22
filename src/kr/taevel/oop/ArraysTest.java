package kr.taevel.oop;

import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {
        String[] str = {"권태훈", "이동준", "권보성", "박태훈"};

        System.out.println(Arrays.toString(str));

        String[] dest = Arrays.copyOf(str, str.length);

        System.out.println(Arrays.toString(dest));

        System.out.println(str == dest);
        System.out.println(Arrays.equals(str, dest));

        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));

        System.out.println(Arrays.binarySearch(dest, "만점"));
    }

}
