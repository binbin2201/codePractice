package practice;

import java.util.Scanner;

public class GetMaxNumber {
    public static void main(String[] args) {
        boolean isMax = true;
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        System.out.println("please enter your first number:");
        int one = scanner.nextInt();
        System.out.println("please enter your second number:");
        int two = scanner.nextInt();
        System.out.println("please enter your third number:");
        int three = scanner.nextInt();
        while(isMax){
            if (one>=two && one>=three){
                max = one;
                isMax = false;
                break;
            }else
            if (two>=one && two>=three){
                max = two;
                isMax = false;
                break;
            }else{
                max = three;
                isMax = false;
                break;
            }
        }
        System.out.println("Max number is : "+ max);
    }
}

