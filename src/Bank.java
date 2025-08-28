public class Bank {
    private int Balance = 10000;
    public void withdraw(int amount){
        if (amount > Balance){
            throw new RuntimeException("Insufficient Balance");
        } else {
            Balance -= amount;
            System.out.println("Withdrawn" + Balance);
        }
    }

}
