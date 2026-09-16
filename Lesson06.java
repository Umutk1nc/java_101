class Lesson06
{
    public static void main(String[] args)
    {
        drawLine();
        writeWelcome();
        drawLine();
        System.out.println("Today's topic: Functions");
        drawLine();
        String name="Umut";
        sayHello(name);


        showDiscountedPrice("Shirt",850,0.32);
        double result=weeklyProfitCalculate(10,18.5,143);
        System.out.println("Weekly profit is: "+result);


    }

    //Every call "Welcome to the system." will be printed
    static void writeWelcome()
    {
        System.out.println("Welcome to the system.");
    }
    static void drawLine()
    {
        System.out.println("-----------------------------------");
    }
    static void sayHello(String name)
    {
        System.out.println("Hello "+ name);

    }
    static void showDiscountedPrice(String name,double price,double discountRate)//void return type means no return value
    {
        //Shirt 578 TL instead of 850 TL
        double discountedPrice = price*(1-discountRate);
        System.out.println(name +" is "+ discountedPrice + " TL instead of "+ price +" TL");
    }
    static double weeklyProfitCalculate(double cost,double sellingPrice,int numberOfSales)//double return type means return value is double
    {
        double net=sellingPrice-cost;
        double profit=net*numberOfSales;
        return profit;
    }
}