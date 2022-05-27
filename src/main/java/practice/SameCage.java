package practice;

//已知:雞兔共35只,共94只腳,那麼雞和兔各幾隻?
public class SameCage {
    public static void main(String[] args) {
        for (int c = 0,r = 35; c <= 35 ; c++,r--) {
            if (c*2 + r*4 == 94){
                System.out.println("雞:"+c+"兔:"+r);
            }
        }
    }

}
