import java.util.Scanner;
//Main class
public class Main
{
    public static void main(String[] args)
    {
        Banking bank = new Banking();
          bank.Bank();
    }
}
// Bank Class to display methods 
 class Banking
{
    Scanner sc = new Scanner(System.in);
    int choice;
    double amount, cash;
    double current = 10000, saving = 5000;
    //Method to display the menu options
    public void Bank() {
        while (true) { 
            System.out.println("****************************************************");
            System.out.println("********** WELCOME TO BANKING APPLICATION **********");
            System.out.println("****************************************************");

            System.out.println("1. Current Account ");
            System.out.println("2. Savings Account ");
            System.out.println("3. Exit the program ");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Current(); // Method to display the current account menu
                    break;
                case 2:
                    Savings(); // Method to display the saving account menu
                    break;
                case 3:
                    System.out.println("Have a good day!");
                    System.exit(0); // Exit
                    break;
                    default:
                    System.out.println("Invalid Choice! Please enter again.");
            }
        }
    }
    //Method to display the current account menu

    public void Current() {
        System.out.println("*********** CURRENT ACCOUNT **************");
        while (true) { // Method calls itself until user press 3
        System.out.println("1. Deposit Funds ");
        System.out.println("2. Withdraw Funds ");
        System.out.println("3. Return to main menu ");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

            switch (choice) {
                case 1: // case 1 to depsoit amount in saving
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    current += amount;
                    System.out.println("Your Current Balance after deposition is: " + current);
                    break;
                case 2: // case 2 To withdraw amount from saving
                    System.out.print("Enter amount to withdraw: ");
                    cash = sc.nextDouble();
                    if (cash > current) {
                        System.out.println("Insufficient Balance!  Try Again.");
                    } else {
                        current -= cash;
                        System.out.println("Current balance after withdraw is: " + current);
                    }
                    break;
                case 3:
                    Bank();  //Returning back to main menu
                    break;
                default:
                    System.out.println("Invalid Choice!  Please enter again.");
            }
        }
    }

    //Method to display the savings account menu 
   
    public void Savings()
    {
        System.out.println("************ SAVINGS ACCOUNT **************");
        while (true) // Method calls itself until user press 3
        {
        System.out.println("1. Deposit Funds ");
        System.out.println("2. Withdraw Funds ");
        System.out.println("3. Return to main menu ");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

            switch (choice) {
                case 1: // case 1 to deposit the amount in Savings ACCOUNT
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    saving += amount;
                    System.out.println("Amount after deposit: " + saving);
                    break;
                case 2: // Case 2 to withdraw amount from Savings ACCOUNT
                    System.out.print("Enter amount to withdraw: ");
                    cash = sc.nextDouble();
                    if (cash > saving) {
                        System.out.println("Insufficient Balance!  Try Again!"); // If person enters amount bigger than saving
                    } else {
                        saving -= cash;
                        System.out.println("Current balance after withdraw is: " + saving);
                    }
                    break;
                case 3: // Case 3 calls main menu 
                    Bank();
                    break;
                default:
                    System.out.println("Invalid Choice! Please enter again.");
            }
        }
    }
}
