package practice;

//分別通過for迴圈/While迴圈/do-While迴圈寫一個死迴圈
public class DeadCycle {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            System.out.println("Its a dead cycle.");
        }
        //boolean hi = true;
        //while(hi){
        //    System.out.println("hi.");
        //}
        //do {
        //    System.out.println("how did you get here?");
        //}while(hi);

    }
}
