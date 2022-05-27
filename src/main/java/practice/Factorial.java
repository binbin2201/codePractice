package practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: .......");
        int num = s.nextInt();
        f(num);
    }

    public static void f(int num) {
        if (num<0){
            System.out.println("Enter a positive number");
            return;
        }
        long ans = 1;
        for (int i = num; i > 0; i--) {
            ans = i * ans;
        }
        System.out.println(ans);
    }
}

