package practice;

import java.util.Scanner;

/*練習題3: 手機選號:根據使用者輸入的手機號來確認使用者實際支付的價格
如果尾數為8，需支付辦卡費50元
如果尾數為4，需支付辦卡費用0元
如果是其他尾號,需支付辦卡費用元*/

public class PayCard {
    public static void main(String[] args) {
        boolean wrong = true;
        while(wrong) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your phone number: .....");
            String num = scanner.nextLine();
            GetPrice(num);
            if(num.length() == 10){
                break;
            }
        }
    }
    public static void GetPrice(String num ) {
        if (num.length() != 10) {
            System.out.println("Please enter a correct form of your number");
            return;
        }
        char c = num.charAt(9);
        int price = 0;
        switch (c) {
            case 8:
                price = 50;
                break;
            case 4:
                break;
            default:
                price = 20;
                break;
        }
        System.out.println(price+" dollars");

    }
}


