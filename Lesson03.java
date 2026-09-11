import java.util.Scanner;

class Lesson03
{
    public static void main(String[] args)
    {
        //Application 1: To login to the system with If statement
        //Just user umut and password Umut.123 can login to the system
        System.out.println("Welcome to the system");
        System.out.println("Please enter your username:");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Please enter your password:");
        String password=scanner.next();

        if (username.equals("umut"))
        {
            System.out.println("Welcome Umut");
            if (password.equals("Umut.123"))
            {
                System.out.println("Umut, Successful Login");
            }
            else
            {
                System.out.println("Umut, Wrong Password");
            }
        }
        else
        {
            System.out.println("User not found");
        }
        System.out.println("This message is displayed regardless of the login status");

        //Application 2: Traffic light selection with switch case statement
        System.out.println("Traffic light selection with switch case statement");
        System.out.println("Please select the traffic light:\n1 - Red\n2 - Yellow\n3 - Green");
        int selection = scanner.nextInt();
        //Switch case statement to handle traffic light selection
        
        switch (selection)
        {
            case 1 -> System.out.println("Stop");
            case 2 -> System.out.println("Prepare to go");
            case 3 -> System.out.println("Go");
            default -> System.out.println("Invalid selection");
        }
        //Application 3: Casting
        //Casting:
        System.out.println("Casting:");
        int integerNumber=257;
        //implicitly casting(widening)
        double value=integerNumber;
        System.out.println("Integer:"+integerNumber);
        System.out.println("Double value:"+value);
        //explicit casting (narrowing)
        byte eightBit=(byte)integerNumber;
        //when we cast 257 to byte, it will overflow and the result will be 1 because byte can only hold values from -128 to 127. The value wraps around after reaching the maximum value of 127.
        System.out.println("Eight-bit value:"+eightBit);

        char firstLetterOFName='U';
        int asciiCode=(int)firstLetterOFName;
        System.out.println("ASCII code:"+asciiCode);


        System.out.println("Please enter a number:");
        String expression=scanner.next();
        int number=Integer.parseInt(expression);
        System.out.println(number);
        value=number;
        System.out.println("Double value:"+value);
        eightBit=(byte)number;
        System.out.println("Eight-bit value:"+eightBit);


    }
}