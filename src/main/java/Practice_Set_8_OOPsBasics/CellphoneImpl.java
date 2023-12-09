package Practice_Set_8_OOPsBasics;

// Q2. Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.

class Cellphone {
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void call(){
        System.out.println("Calling...");
    }
}

public class CellphoneImpl {
    public static void main(String[] args) {

        Cellphone samsung = new Cellphone();
        samsung.ring();
        samsung.vibrate();
        samsung.call();

    }
}
