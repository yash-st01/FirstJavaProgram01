public class DayNameOfTheWeek {

    public static void main(String[] args){

        System.out.println("WeekNumber : " +7);
        int weekNumber;
        weekNumber=1;
        weekNumber=2;
        weekNumber=3;
        weekNumber=4;
        weekNumber=5;
        weekNumber=6;
        weekNumber=7;

        if (weekNumber == 1)
            System.out.println("Monday");
        else if (weekNumber == 2)
            System.out.println("Tuesday");
        else if (weekNumber == 3)
            System.out.println("Wednesday");
        else if (weekNumber == 4)
            System.out.println("Thursday");
        else if (weekNumber == 5)
            System.out.println("Friday");
        else if (weekNumber == 6)
            System.out.println("Saturday");
        else if (weekNumber == 7)
            System.out.println("Sunday");
        else {
            System.out.println("Invalid Week");
        }

    }
}


