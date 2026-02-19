package Day9_10.InterestCalculator;

public class FDAccount extends Account {

    double interestRate;
    double amount;
    int noOfDays;
    int ageOfACHolder;

    public FDAccount(double amount, int noOfDays, int ageOfACHolder) throws InvalidInputException{

        if(amount < 0) throw new InvalidInputException("Invalid Amount. Please enter non-negative values.");

        if(noOfDays < 0) throw  new InvalidInputException("Invalid Number of days. Please enter non-negative values.");

        if(ageOfACHolder < 0) throw new InvalidInputException("Invalid Age of Account Holder. Please enter non-negative values.");

        this.amount = amount;
        this.noOfDays = noOfDays;
        this.ageOfACHolder = ageOfACHolder;
    }

    @Override
    double calculateInterest() {

        if(amount > 10000000){

            if(noOfDays < 7){
                interestRate = 0.0;
            }else if (noOfDays<15){
                interestRate = amount*0.065;
            } else if (noOfDays<30) {
                interestRate = amount * 0.0675;
            }else if(noOfDays < 44){
                interestRate = amount * 0.0675;
            } else if (noOfDays < 61) {
                interestRate = amount * 0.08;
            } else if (noOfDays < 185) {
                interestRate = amount * 0.085;
            }else {
                interestRate = amount * 0.1;
            }

        }else {

            if (ageOfACHolder > 60){

                if(noOfDays < 7){
                    interestRate = 0.0;
                }else if (noOfDays<15){
                    interestRate = amount*0.05;
                } else if (noOfDays<30) {
                    interestRate = amount * 0.0525;
                }else if(noOfDays < 44){
                    interestRate = amount * 0.06;
                } else if (noOfDays < 61) {
                    interestRate = amount * 0.075;
                } else if (noOfDays < 185) {
                    interestRate = amount * 0.08;
                }else {
                    interestRate = amount * 0.085;
                }
            }else {

                if(noOfDays < 7){
                    interestRate = 0.0;
                }else if (noOfDays<15){
                    interestRate = amount*0.045;
                } else if (noOfDays<30) {
                    interestRate = amount * 0.0475;
                }else if(noOfDays < 44){
                    interestRate = amount * 0.055;
                } else if (noOfDays < 61) {
                    interestRate = amount * 0.07;
                } else if (noOfDays < 185) {
                    interestRate = amount * 0.075;
                }else {
                    interestRate = amount * 0.8;
                }
            }
        }

        return interestRate;
    }
}
