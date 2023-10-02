

public class TransactionHisto {
    public static void main(String[] args) {
        
    }

    public void TransactionHistory(BankAccount b) {
        if (b.transactions == 0)
            System.out.println("\nEmpty");
        else
            System.out.println("\n" + b.transactionHistory);
    }
}
