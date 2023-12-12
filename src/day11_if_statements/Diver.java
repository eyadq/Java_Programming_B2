package day11_if_statements;

public class Diver {

    public static void main(String[] args) {

        int oxygenLevel = 100;

        if(oxygenLevel >= 90){
            System.out.println("Your tank is full");
        } else if(oxygenLevel >= 80){
            System.out.println("Still okay");
        } else if(oxygenLevel >= 70){
            System.out.println("Don't go too far");
        } else if(oxygenLevel >= 60){
            System.out.println("Start to head back");
        } else if(oxygenLevel >= 50){
            System.out.println("Be careful now, you are at 50%");
        } else {
            System.out.println("You were a good guy. BYE BYE.");
        }

        System.out.println("_________________________________");

        String message;
        if(oxygenLevel >= 90){
            message = "Your tank is full";
        } else if(oxygenLevel >= 80){
            message = "Still okay";
        } else if(oxygenLevel >= 70){
            message = "Don't go too far";
        } else if(oxygenLevel >= 60){
            message = "Start to head back";
        } else if(oxygenLevel >= 50){
            message = "Be careful now, you are at 50%";
        } else {
            message = "You were a good guy. BYE BYE.";
        }
        System.out.println(message);
    }

}
