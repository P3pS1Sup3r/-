package Lab2;
/**
 * DVDtapeTestDrive
 */
public class DVDPlayerTestDrive {
    public static void main(String[] args) {
        
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        // d.playDVD();

        if (d.canRecord) {
            d.recordDVD();
        }

    }
}

/**
 * DVDPlayer
 */
class DVDPlayer {

    boolean canRecord = false;

    void recordDVD() {
        System.out.println("Идет запись ДВД");
    }
}
