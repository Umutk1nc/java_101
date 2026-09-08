import java.util.Scanner;//Scanner class is used to get user input

class Lesson02
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);//Scanner class is used to get user input
        System.out.println("Please enter the first number:");
        double x =scanner.nextDouble();//nextDouble() method is used to get user input as a double
        System.out.println("Please enter the second number:");
        double y =scanner.nextDouble();

       // ARITHMETIC OPERATORS //
        System.out.println("\n---------Arithmetic Operators---------");
        System.out.println("Sum:" + (x+y));
        System.out.println("Difference:" + (x-y));
        System.out.println("Product:" + (x*y));
        System.out.println("Division:" + (x/y));

        System.out.println("Mod:" + ((int)x%(int)y));

        // COMPARISON OPERATORS //
        System.out.println("\n-------Comparison Operators-------");
        System.out.println("x>y:" + (x>y));
        System.out.println("x<y:" + (x<y));
        System.out.println("x==y:" + (x==y));
        System.out.println("x!=y:" + (x!=y));
        System.out.println("\n-------Compound Assignment Operators-------");
        int number =(int)x;
        number+=10;//number=number+10
        number/=2;
        number*=5;
        number-=10;
        System.out.println(number);

        System.out.println("-----prefix-suffix-----");
        int defaultValue=10;
        System.out.println("First Number:"+defaultValue);
        System.out.println("++x:"+ ++defaultValue);//increment first
        System.out.println("x++:"+ defaultValue++);//print first, then increment
        System.out.println("Current Value of the Variable:"+ defaultValue);

        //Body Mass Index
        System.out.println("Please enter your weight:");
        double kg =scanner.nextDouble();
        System.out.println("Please enter your height (m):");
        double boy =scanner.nextDouble();
        double endex=kg/(boy*boy);
        System.out.println("Body Mass Index:"+endex);

        boolean xIsPositive=x>0;
        boolean yIsPositive=y>0;
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println("Are both positive? "+ (xIsPositive && yIsPositive));
        System.out.println("Is at least one positive? "+ (xIsPositive || yIsPositive));
        System.out.println("Is x negative? "+ !xIsPositive);

    }
}