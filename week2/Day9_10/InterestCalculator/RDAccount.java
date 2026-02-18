package Day9_10.InterestCalculator;

public class RDAccount extends Account {

    double interestRate;
    double amount;
    int noOfMonths;
    int ageOfACHolder;

    public RDAccount(double amount, int noOfMonths, int ageOfACHolder) {
        this.amount = amount;
        this.noOfMonths = noOfMonths;
        this.ageOfACHolder = ageOfACHolder;
    }

    @Override
    double calculateInterest() {

        if (ageOfACHolder < 60){

            if (noOfMonths < 6){
                interestRate = 0.0;
            } else if (noOfMonths < 9) {
                interestRate = amount * 0.075;
            } else if (noOfMonths<12) {
                interestRate = amount * 0.0775;
            } else if (noOfMonths < 15) {
                interestRate = amount * 0.08;
            } else if (noOfMonths < 18) {
                interestRate = amount * 0.0825;
            }else if (noOfMonths < 21){
                interestRate = amount * 0.085;
            }else {
                interestRate = amount * 0.0875;
            }

        }else {
            if (noOfMonths < 6){
                interestRate = 0.0;
            } else if (noOfMonths < 9) {
                interestRate = amount * 0.08;
            } else if (noOfMonths<12) {
                interestRate = amount * 0.0825;
            } else if (noOfMonths < 15) {
                interestRate = amount * 0.085;
            } else if (noOfMonths < 18) {
                interestRate = amount * 0.0875;
            }else if (noOfMonths < 21){
                interestRate = amount * 0.09;
            }else {
                interestRate = amount * 0.0925;
            }
        }

        return interestRate;
    }

}
