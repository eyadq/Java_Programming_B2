package day08_scanner_logical_operators;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Tom Jerry";
        boolean isCitizen = true;
        boolean isCriminal = false;
        int age = 30;
        boolean isEligible = isCitizen && !isCriminal && (age >= 18); //do not need () due to precedence of >=

        System.out.println(name + " is elgible to vote: " + isEligible);
    }
}
