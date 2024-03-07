package variable;

public class Var2 {
    public static void main(String[] args) {
        int a, b;
        a = 2;
        b = 3;
        int c = a+b;
        varEx1();
        varEx2();
        varEx3();
    }

    public static void varEx1(){
        int num1 = 3;
        int num2 = 4;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
    }
    public static void varEx2(){
        int num1 = 10;
        int num2 = 20;
        int sum = num1+num2;
        System.out.println("sum = " + sum);
    }
    public static void varEx3(){
        long num = 10000000000L;
        boolean flag = true;
        System.out.println(num);
        System.out.println(flag);
    }
}
