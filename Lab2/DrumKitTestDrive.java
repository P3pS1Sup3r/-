package Lab2;

public class DrumKitTestDrive {
    
    public static void main(String[] args) {
    
        DrumKit d = new DrumKit();

        if (d.snare) {
            d.playSnare();
        }
        d.playToHat();
    }
}

class DrumKit {

    boolean topHat = true;
    boolean snare = true;

    void playToHat() {    
        System.out.println("Динь динь ди-динь");
    }

    void playSnare() {
        System.out.println("Бах бах ба-бах");
    }
}
