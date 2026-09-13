import java.util.Scanner;

class Lesson04
{
    public static void main(String[] args)
    {
        //Loop is a programming structure that repeats a sequence of instructions until a specific condition is met.
        int total=0;
        int number;
        Scanner scanner = new Scanner(System.in);
        //while loop is used to execute a block of code repeatedly as long as a specified condition is true.
        while (true)
        {
            System.out.println("0 - For Quit, Enter a Number: ");
            number= scanner.nextInt();
            //if the user enters 0, the loop will break and exit.
            if (number==0)
            {
                break;
            }
            total+=number;
            System.out.println("Instant Total: "+total);
        }
        System.out.println("Total: "+total);

        int attempts=3;
        String PIN;//PIN="123"
        System.out.println("Please enter your pin code. Attempts:"+attempts--);
        PIN=scanner.next();
        if (PIN.equals("123"))
        {
            System.out.println("Welcome to your account.\n");
        }
        while (!PIN.equals("123")&& attempts>0)
        {
            System.out.println("Please enter your pin code. Remaining attempts: "+attempts--);
            PIN=scanner.next();
            if (PIN.equals("123"))
            {
                System.out.println("Welcome to your account.");
            }
            else if (attempts==0)
            {
                System.out.println("Your account is blocked.");
            }
        }
        String enteredPin;
        int tries=3;
        //do while loop is similar to while loop, but it will always execute the block of code at least once, even if the condition is false.
        do
        {
            System.out.println("Remaining attempts for do while: "+tries--);
            enteredPin=scanner.next();
        }while (!enteredPin.equals("0")&& tries>0);
        if (enteredPin.equals("0"))
        {
            System.out.println("You have entered the correct pin.");
        }
        else
        {
            System.out.println("Your account is blocked.");
        }


        //for loop is used to iterate a block of code a specific number of times.
        System.out.println("For loop example:");
        for (int i=1;i<5;i++)
        {
            System.out.println(i);
        }
    }
}