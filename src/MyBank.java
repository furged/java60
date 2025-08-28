public class MyBank {
    public static void main(String[] args) {
        Bank b = new Bank();
        try {
            b.withdraw(50000);

        }
        catch (InsufficientBankBalance e) {
            System.out.println(e.getMessage());
        }
    }
}
