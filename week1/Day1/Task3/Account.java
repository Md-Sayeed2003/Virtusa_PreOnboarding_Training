package Task3;

public class Account {

    private double balance;

    public void deposit(double amt){
        balance += amt;

        System.out.println("Amount deposited successfully");
    }

    public void getBalance(){
        System.out.println("Balance : "+balance);
    }

    public void withdraw(double amt){
        if(amt > balance){
            System.out.println("Amount Insufficient ");
            return;
        }

        balance -= amt;
        System.out.println("Withdrawn successfully");
    }

}
