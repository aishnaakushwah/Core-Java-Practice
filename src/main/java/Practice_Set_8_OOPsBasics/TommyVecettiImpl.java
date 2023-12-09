package Practice_Set_8_OOPsBasics;

// Q4. Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.

class TommyVecetti {
    public void hit(){
        System.out.println("Hitting...");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void fire(){
        System.out.println("Firing...");
    }
}

public class TommyVecettiImpl {
    public static void main(String[] args) {

        TommyVecetti player = new TommyVecetti();
        player.hit();
        player.run();
        player.fire();
    }
}
