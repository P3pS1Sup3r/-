package Lab2;

/**
 * TapeDeckTestDrive
 */
public class TapeDeckTestDrive {

    public static void main(String[] args) {
        
        // TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playOut();
        
        if (t.canRecord) {
            t.recordTape();
        }

    }
}

/**
 * TapeDeck
 */
class TapeDeck {

    boolean canRecord = false;

    void playOut() {
        System.out.println("Пленка проигрываеться");    
    }

    void recordTape() {
        System.out.println("Идет запись на пленку");
    }
}