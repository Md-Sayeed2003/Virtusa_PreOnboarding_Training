package Day9_10.InterestCalculator;

public class SBAccount extends Account {

    double interest;
    double amount;
    String type;

    public SBAccount(double amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    @Override
    double calculateInterest() {

        if (type.equalsIgnoreCase("Normal")){
            interest = amount * 0.04;
        }else if (type.equalsIgnoreCase("NRI")){
            interest = amount * 0.06;
        }else {
            interest = 0.0;
        }

        return interest;
    }

}
