package Day9_10.InterestCalculator;

public abstract class Account {

    double interestRate;
    double amount;

    abstract double calculateInterest() throws InvalidInputException;
}
