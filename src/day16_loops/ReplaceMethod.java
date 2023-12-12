package day16_loops;

public class ReplaceMethod {

    public static void main(String[] args) {
        String s = "java is a language";
        System.out.println(s);
        s = s.replace('a', 'e');
        System.out.println(s);
        s = s.replace('g', 'h');
        System.out.println(s);

        String day = "Today is Wednesday, we will learn java on Wednesday. It is Wednesday";
        System.out.println(day);
        day = day.replace("Wednesday", "Thursday");
        System.out.println(day);

        String msg = "Today is Wednesday, we will learn java on Wednesday. It is Wednesday";
        System.out.println(msg);
        msg = msg.replace("Wednesday,", "Thursday"); //watch out for comma in Wednesday,
        System.out.println(msg);

        msg = "Today is Wednesday, we will learn java on Wednesday. It is Wednesday";
        msg = msg.replaceFirst("Wednesday", "Saturday");
        System.out.println(msg);
        msg.replaceFirst("Saturday", "Thursday");
        System.out.println(msg);


    }
}
