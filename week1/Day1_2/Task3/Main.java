package Task3;

public class Main {

    public static void main(String[] args) {

        Account a1 = new Account();
        a1.deposit(10000);
        a1.getBalance();
        a1.withdraw(2000);
        a1.getBalance();
        a1.withdraw(12000);


        Account a2 = new Account();
        a2.withdraw(2000);
        a2.deposit(5000);
        a2.getBalance();

    }

}
