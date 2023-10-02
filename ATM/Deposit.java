
import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {

    }

    public void deposit(BankAccount b) {

        System.out.print("\nEnter amount to deposit : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        try {
            if (b.balance <= 100000f) {
                b.transactions++;
                b.balance += amount;
                System.out.println("\nSuccessfully deposited ");
                String str = amount + " Rs deposited\n";
                b.changeTrasaction(b.transactionHistory.concat(str));
            } else
                System.out.println("\nSorry.... Limit is 100000.00");
        } catch (Exception e) {
        }
    }

}
