public class Main {
    public static void main(String[] args) {
        Student st=new Student(1, "Anushka", "A");
       //  System.out.println(st.grade);
        st.setGrade("A+");
        System.out.println(st.getGrade());
    }
}
