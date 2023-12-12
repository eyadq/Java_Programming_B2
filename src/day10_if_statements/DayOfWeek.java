package day10_if_statements;

public class DayOfWeek {

    public static void main(String[] args) {
        int day = 1;

        //Once first true condition is reached, the rest is skipped
        if(day ==1 )
            System.out.println("Monday");
        else if(day ==2 )
            System.out.println("Tuesday");
        else if(day ==3 )
            System.out.println("Wednesday");
        else if(day ==4 )
            System.out.println("Thursday");
        else if(day ==5 )
            System.out.println("Friday");
        else if(day ==6 )
            System.out.println("Saturday");
        else if(day ==7)
            System.out.println("Sunday");
        else
            System.out.println("Not valid weekday");

        System.out.println("--------------------------");

        //The issue here is every statement is checked, leads to performance issues in large projects
        if(day ==1 )
            System.out.println("Monday");
        if(day ==2 )
            System.out.println("Tuesday");
        if(day ==3 )
            System.out.println("Wednesday");
        if(day ==4 )
            System.out.println("Thursday");
        if(day ==5 )
            System.out.println("Friday");
        if(day ==6 )
            System.out.println("Saturday");
        if( day ==7 )
            System.out.println("Sunday");

    }
}
