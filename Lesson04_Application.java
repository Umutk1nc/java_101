import java.util.Scanner;

class Lesson04_Application
{
    public static void main(String[] args)
    {
        //Purpose: To simulate a basic ATM machine functionality
        //1. The application starts with a PIN code entry:
        //If the PIN is entered incorrectly 3 times, the system will not respond.
        //2. A menu will open with the following options:
        //  a. Check balance
        //  b. Deposit money
        //  c. Withdraw money
        //  d. Exit
        //Each action will continue until option d is selected, returning to the menu in step 2.

        Scanner scanner=new Scanner(System.in);
        double balance=2000;
        int correctPin=1199;
        int enteredPin;
        int incorrectEntries=0;
        double dailyLimit=10000;
        int selection;

        do
        {
            System.out.println("Please enter your PIN code:");
            enteredPin=scanner.nextInt();
            incorrectEntries++;
            int remainingAttempts=3-incorrectEntries;
            if (enteredPin!=correctPin)
            {
                if (remainingAttempts<=0)
                {
                    System.out.println("The PIN you entered is incorrect. Your card is being retained for security reasons...");
                    return;
                }
            }
        }while (enteredPin !=correctPin && incorrectEntries<3);
        System.out.println("Successfully logged in. Welcome to the ATM system.");
        do
        {
            System.out.println("What would you like to do?");
            System.out.println("1 - Check Balance");
            System.out.println("2 - Deposit Money");
            System.out.println("3 - Withdraw Money");
            System.out.println("4 - Exit");
            System.out.println("Please make your selection:");
            selection=scanner.nextInt();
            switch(selection)
            {
                case 1 -> System.out.println("Your balance is: "+ balance + " TL");
                case 2 -> {
                    System.out.println("Please enter the amount you want to deposit:");
                    double depositAmount =scanner.nextDouble();
                    if (depositAmount<=0)
                    {
                        System.out.println("Amount cannot be 0 or negative");
                    }
                    else
                    {
                        balance+=depositAmount;
                        System.out.println(depositAmount+" TL deposit. New Balance "+balance +" TL");
                    }
                }
                case 3 -> {
                    System.out.println("Please enter the amount you want to withdraw:");
                    double withdrawAmount =scanner.nextDouble();
                    if(withdrawAmount<=0)
                    {
                        System.out.println("Withdrawal amount cannot be 0 or negative");
                    } else if (withdrawAmount>dailyLimit)
                    {
                        System.out.println("Withdrawal amount cannot exceed daily limit of "+dailyLimit+" TL");
                    }else if (withdrawAmount>balance)
                    {
                        System.out.println("Insufficient balance. Your current balance is "+balance+" TL");
                    }
                    else
                    {
                        balance-=withdrawAmount;
                        System.out.println(withdrawAmount+" TL withdrawn. New Balance "+balance +" TL");
                    }

                }
                case 4 -> {
                }
                default -> System.out.println("Invalid selection. Please select between 1-4");
            }
        }while(selection !=4);

    }
}