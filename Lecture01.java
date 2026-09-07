public class Lecture01
//This is a simple Java program
{
    public static void main(String[]args)//main method is the entry point of the program
    {
        //Integers
        int level=1;
        short hp=1000;
        byte extraHp=50;
        long experience=1_000_000_000_000L;//L must be added to the end of the number to indicate that it is a long literal

        //Decimal Numbers
        double damage=48.5;
        float speed=3.1f;//f must be added to the end of the number to indicate that it is a float literal
        
        //Character and String
        char key='B';
        String name="Kivanch";
        System.out.println("========= Hero Information =========");//System.out.println() method is used to print the information
        System.out.println("Name:"+ name);
        System.out.println("Level:"+ level);
        System.out.println("HP:"+ hp);
        System.out.println("Extra HP:"+ extraHp);
        System.out.println("Damage:"+ damage);
        System.out.println("Speed:"+ speed);
        System.out.println("Experience:"+ experience);
        System.out.println("Character Code:"+ key);

    }

}
