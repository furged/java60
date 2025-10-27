package Unit2;

public class Switch1 {

        public static void main(String a[])

        {

            String day = "Monday";

            switch (day) {

                case "Monday":

                    System.out.println("Week day");

                    break;

                case "Tuesday":

                    break;

                case "Friday":

                    System.out.println("Week day");

                    break;

                case "Saturday":

                    System.out.println("Weekend");

                    break;

                case "Sunday":

                    System.out.println("Weekend");

                    break;

                default:

                    System.out.println("Unknown"); }}
}
