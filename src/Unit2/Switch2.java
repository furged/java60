package Unit2;

public class Switch2 {


        public static void main(String a[])

        {

            enum DAYS {

                MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

            DAYS days = DAYS.MONDAY;

            switch (days) {

                case MONDAY:

                    System.out.println("Weekdays");

                    break;

                case FRIDAY:

                    System.out.println("Weekdays");

                    break;

                case SATURDAY:

                    System.out.println("Weekends");

                    break;

                case SUNDAY:

                    System.out.println("Weekends");

                    break;

                default:

                    System.out.println("Unknown");

            }}
}
