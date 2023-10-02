
import java.util.Scanner;

class BankAccount {

  String name, userName, password, accountNo, transactionHistory = " ";
    float balance = 0f;
    int transactions = 0;
    

    public static void main(String[] args) {

    }

    public void register() {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter your userid : ");
        this.userName = sc.nextLine();
        System.out.print("\n Enter your pin : ");
        this.password = sc.nextLine();
        System.out.print("\n Enter your Account Number : ");
        this.accountNo = sc.nextLine();
        System.out.println("\n Registration completed successfully ! please login ");
    }

    public boolean login() {
        boolean isLogin = false;
        Scanner sc = new Scanner(System.in);
        while (!isLogin) {
            System.out.print("\nEnter your userid : ");
            String Username = sc.nextLine();
            if (Username.equals(userName)) {
                while (!isLogin) {
                    System.out.print("\nEnter your pin : ");
                    String Password = sc.nextLine();
                    if (Password.equals(password)) {
                        System.out.print("\nLogin successfully!");
                        isLogin = true;
                    } else
                        System.out.println("\nIncorrect password ");
                }
            } else
                System.out.println("\nUsername not found");
        }
        return isLogin;
    }

    public void changeTrasaction(String transactionhistory){
        this.transactionHistory  = transactionhistory;
    }

    public String getTransaction(){
        return transactionHistory;
    }

    public void checkBalance(){
        System.out.println(balance);
    }
}