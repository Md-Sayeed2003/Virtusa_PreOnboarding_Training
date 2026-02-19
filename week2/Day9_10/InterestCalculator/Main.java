package Day9_10.InterestCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        while (true){

            System.out.println("\nMAIN MENU");
            System.out.println("1. Interest Calculator – SB");
            System.out.println("2. Interest Calculator – FD");
            System.out.println("3. Interest Calculator – RD");
            System.out.println("4. Exit");
            System.out.print("Enter your option (1..4): ");

            int choice = sc.nextInt();

            try{

                switch (choice){
                    case 1 :
                        System.out.print("Enter the average amount in your account : ");
                        double amount = sc.nextDouble();
                        System.out.print("Enter the type of your account (Normal / NRI) : ");
                        String type = sc.next().trim();
                        SBAccount sb = new SBAccount(amount,type);
                        System.out.print("Interest gained : Rs. "+sb.calculateInterest());
                        break;

                    case 2 :
                        System.out.print("Enter the FD Amount : ");
                        double fdAmount = sc.nextDouble();
                        System.out.print("Enter the no of days : ");
                        int nod = sc.nextInt();
                        System.out.print("Enter your age : ");
                        int age = sc.nextInt();
                        FDAccount fd = new FDAccount(fdAmount,nod,age);
                        System.out.print("Interest gained : Rs. "+fd.calculateInterest());
                        break;

                    case 3 :
                        System.out.print("Enter the RD Amount : ");
                        double rdAmount = sc.nextDouble();
                        System.out.print("Enter the no of months : ");
                        int months = sc.nextInt();
                        System.out.print("Enter your age : ");
                        int rdAge = sc.nextInt();
                        RDAccount rd = new RDAccount(rdAmount,months,rdAge);
                        System.out.print("Interest gained : Rs. "+rd.calculateInterest());
                        break;

                    case 4:
                        System.out.print("Thank You!");
                        System.exit(0);

                    default:
                        System.out.print("Invalid Option!");

                }

            }catch (InvalidInputException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
