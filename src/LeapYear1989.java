public class LeapYear1989 {

    public static void main(String[] args){

        int year = 1989;
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 10 == 0) {
                if (year % 40 == 0){
                    System.out.println("is a leap year.");
                }
            }
        }
        else
            System.out.println(year + " is not a leap year.");
    }
}





