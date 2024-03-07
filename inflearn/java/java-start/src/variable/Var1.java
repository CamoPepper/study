package variable;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Var1 {
    public static void main(String[] args) {
        System.out.println(10);
        int number = 10;
//        for(int i = 0; i < 4; i++){
//            number = 20;
//            System.out.println(number);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("입력하신 숫자는 " +num+"입니다.");


    }
}
