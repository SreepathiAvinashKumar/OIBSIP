import java.util.Scanner;

class ATM_Interface {
    public static int takeIntegerInput(int limit) {
        int input = 0;
        boolean flag = false;
        while (!flag) {
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                flag = true;
                if (flag && (input > limit || input < 1)) {
                    System.out.println("Choose the number between 1 to " + limit);
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("Enter only integer value ");
                flag = false;
            }
        }
        return input;
    }

    public static void main(String[] args) {
        System.out.println("\n**WELCOME TO ATM INTERFACE **\n");
        System.out.println("1.Register \n2.Exit");
        System.out.print("Enter your choice : ");
        int choice = takeIntegerInput(2);
        if (choice == 1) {
            BankAccount b = new BankAccount();
            b.register();
            while (true) {
                System.out.println("\n1.Login \n2.Exit");
                System.out.print("Enter your choice : ");
                int ch = takeIntegerInput(2);

                if (ch == 1) {
                    if (b.login()) {
                        System.out.println("\n\n**WELCOME BACK " + b.userName + " **\n");
                        boolean isFinished = false;
                        while (!isFinished) {
                            System.out.println(
                                    "\n1.Withdraw \n2.Deposit \n3.Transfer \n4.Transaction History \n5.Check Balance \n6.Exit \n");
                            System.out.print("Enter your choice : ");
                            int c = takeIntegerInput(6);
                            switch (c) {
                                case 1:
                                    Withdraw w = new Withdraw();
                                    w.withdraw(b);
                                    break;
                                case 2:
                                    Deposit d = new Deposit();
                                    d.deposit(b);
                                    break;
                                case 3:
                                    Transfer t = new Transfer();
                                    t.transfer(b);
                                    break;
                                case 4:
                                    TransactionHisto th = new TransactionHisto();
                                    th.TransactionHistory(b);
                                    break;
                                case 5:
                                    b.checkBalance();
                                    break;
                                case 6:
                                    isFinished = true;
                                    break;

                            }
                        }
                    }
                } else
                    System.exit(0);
            }
        } else
            System.exit(0);
    }
}