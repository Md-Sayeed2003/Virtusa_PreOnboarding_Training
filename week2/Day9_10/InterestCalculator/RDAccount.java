package Day9_10.InterestCalculator;

public class RDAccount extends Account {

    double interestRate;
    double amount;
    double monthlyAmount;
    int noOfMonths;
    int ageOfACHolder;

    public RDAccount(double amount, int noOfMonths, int ageOfACHolder) throws InvalidInputException {

        if(amount < 0) throw new InvalidInputException("Invalid Amount. Please enter non-negative values.");

        if(noOfMonths < 0) throw  new InvalidInputException("Invalid Number of months. Please enter non-negative values.");

        if(ageOfACHolder < 0) throw new InvalidInputException("Invalid Age of Account Holder. Please enter non-negative values.");

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
