package org.dimigo.basic;

public class TypeCasting {

    public static void main(String[] args) {
        // 자동형변환 (promotion) : 작은타입 -> 큰타입
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;

        // 강제형변환 (casting) : 큰타입 -> 작은타입
        i = (int)l;
        s = (short)i;
        b = (byte)s;

        int i2 = 128;
        byte b2 = (byte)i2;
        System.out.println(b2);

        long l2 = 10000000000L;
        int i3 = (int)l2;
        System.out.println(i3);
    }

}
