public class UserDefinedException {
    public void validate(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Invalid Age for voting");
        else
            System.out.println("Eligible");
    }
}
