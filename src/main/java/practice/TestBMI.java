package practice;

import java.util.Scanner;

public class TestBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your height: .....(m)");
        double height = scanner.nextDouble();
        System.out.println("Please enter your weight: .....(kg)");
        double weight = scanner.nextDouble();
        double BMI = (weight / Math.pow(height, 2));
        if (BMI < 18.5) {
            System.out.println("BMI過輕 "+BMI);
        }else if ( BMI <= 22.9) {
            System.out.println("BMI正常 "+BMI);
        }else if (BMI <= 24.9) {
            System.out.println("BMI偏胖 "+BMI);
        }else if (BMI <= 29.9) {
            System.out.println("BMI肥胖 "+BMI);
        }else if (BMI <= 40) {
            System.out.println("BMI重度肥胖 "+BMI);
        }else {
            System.out.println("BMI極度肥胖 "+BMI);
        }
    }
}
