package day08_scanner_logical_operators;

public class Speeding {

    public static void main(String[] args) {
        double currentSpeed = 25;
        double speedLimit = 25;
        boolean  isSpeeding = currentSpeed > speedLimit;

        System.out.println("Is speeding: " + isSpeeding);
    }

}
