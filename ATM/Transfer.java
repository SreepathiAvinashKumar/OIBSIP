
import java.util.Scanner;

public class Transfer {
public static void main(String[] args) {
    
}
public void transfer(BankAccount b) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Receipent's name : ");
        String receipent = sc.nextLine();
        System.out.print("Enter amount to transfer :  ");
        float amount = sc.nextFloat();
        try {
            if (b.balance >= amount) {
                if (amount <= 50000f) {
                    b.transactions++;
                    b.balance = b.balance - amount;
                    System.out.println("\n" + amount + " Successfully Transfered to " + receipent);
                    String str = amount + " Rs Transfered to " + receipent + "\n";
                    b.changeTrasaction(b.transactionHistory.concat(str));
                   
                } else
                    System.out.println("\nSorry.... Limit is 50000.00");
            } else
                System.out.println("\nInsufficient balance ");
        } catch (Exception e) {
        }
    }
    
}