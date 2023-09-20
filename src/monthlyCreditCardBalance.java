import java.util.Scanner;

public class monthlyCreditCardBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startingBal = 5000;
        double interestRate = 0.17;
        double balanceOne = startingBal * interestRate;
        double balanceOneTotal = balanceOne + startingBal;
        double balanceTwo = balanceOneTotal * interestRate;
        double balanceTwoTotal = balanceTwo + balanceOneTotal;

        System.out.println("Your total for your first month is " + balanceOneTotal);
        System.out.println("Your total for your second month is " + balanceTwoTotal);

    }
}