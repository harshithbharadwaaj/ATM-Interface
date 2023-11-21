import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int balance = 100000, withdraw, deposit;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("ATM");
            System.out.println("click 1 for Deposits");
            System.out.println("click 2 for withdrawls");
            System.out.println("click 3 for checking the account Balance");
            System.out.println("click 4 for exit");
            System.out.println("choose the option you want:");

            int idly = in.nextInt();
            switch (idly) {
                case 1:
                    System.out.print("Enter the money to deposit");
                    deposit = in.nextInt();
                    balance = balance + deposit;
                    System.out.println("Successfully deposited");
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter money to withdraw:");
                    withdraw = in.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Collect the Money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("Balance:" + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }

}
