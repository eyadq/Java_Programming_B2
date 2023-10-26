package day25_methods;

public class MethodWithOthers {
    public static String dayInWords (int day) {

        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "Invalid number";
        }

    }

    public static void main(String[] args) {
        System.out.println(dayInWords(1));
    }
}
