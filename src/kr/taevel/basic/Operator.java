package kr.taevel.basic;

public class Operator {

    public static void main(String[] args) {
        int a = 5, b = 2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*1.0/b);
        System.out.println(a*b);
        System.out.println(a%b);

        // boolean
        boolean flag = true;
        int m = 10, n = 0;

        if (flag || (m / n == 0)) {
            System.out.println("OR연산");
        }

        if (!flag && (m / n == 0)) {
            System.out.println("AND연산");
        }

        // String connect operator
        String school = "디미고";
        String name = "태훈";
        int grade = 2;
        int klass = 5;

        System.out.println(school + name + grade + klass);
        System.out.println(grade + klass + school + name);
        System.out.println(Integer.toString(grade) + Integer.toString(klass) + school + name);

    }

}
