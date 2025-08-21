public class Student {
    public int roll;
    public String name;
    private String grade;

    public Student(int roll, String name, String grade) {
        this.roll = roll;
        this.name = name;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
