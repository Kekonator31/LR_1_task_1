

class BankAccount {
    private double balance = 200.55;

    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposited " + amount + " to the bank.");
    }

    void getBalance(){
        System.out.println("Your balance is " + balance);
    }

}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.getBalance();
    }
}