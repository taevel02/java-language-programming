package kr.taevel.oop;

public class WrapperTest {

    public static void main(String[] args) {
        // Wrapper 클래스 : Primitive Type를 Wrapping하는 클래스

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.toHexString(10));

        // Boxing
        // 1) 생성자
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        // 2) valueOf()
        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf("100");
        Double d1 = Double.valueOf(3.14);

        // Unboxing
        int r1 = i3.intValue();
        double r2 = d1.doubleValue();

        // 문자열 -> Primitive Type
        int a = Integer.parseInt("100");
        double b = Double.parseDouble("3.14");

        // 100 + 200 = 300;
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));

        Integer i5 = new Integer(1000);
        Integer i6 = new Integer(2000);
        System.out.println(i5 + i6);

        Integer obj1 = 1000; // Autoboxing
        int r3 = obj1 + 100; //Autounboxing

        // 총 몇번의 autoboxing과 autounboxing이 일어났는가.
        Integer obj2 = 10; // box
        Integer obj3 = obj2 + 20; //box unbox
        Integer result = obj2 + obj3; // box unbox unbox
    }

}
