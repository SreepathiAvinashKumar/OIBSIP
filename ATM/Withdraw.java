
import java.util.Scanner;

public class Withdraw {
    public static void main(String[] args) {

    }

    public void withdraw(BankAccount b) {
        System.out.print("\nEnter amount to withdraw : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        try {
            if (b.balance >= amount) {
                b.transactions++;
                b.balance -= amount;
                System.out.println("\nWithdrawl is completed");
                String str = amount + " Rs Withdrawed\n";
                b.transactionHistory = b.transactionHistory.concat(str);
            } else
                System.out.println("\nInsufficient balance ");
        } catch (Exception e) {
        }
    }
}
