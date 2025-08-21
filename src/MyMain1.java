public class MyMain1 {
    public static void main(String[] args) {
        CollegeStudents cs=new CollegeStudents("abc", 2);
        System.out.println("address " + cs.address + "roll no: " + cs.roll_no);
        cs.show_roll();
        cs.show_address();
    }
}
