public class Lesson07 {
    public static void main(String[] args) {
        //Object Oriented Programming
        
        // Polymorphism: User reference holding different subclass objects
        User user1 =new Student("Mike");// User reference and Student object
        User user2 =new Student("Anna",22);
        User user3 =new Teacher("Michael");// User reference and Teacher object
        user1.showRole();
        user2.showRole();
        user3.showRole();
        // Payment through the interface reference
        Payable payable1=new Student("Muhammed",19);
        Payable payable2=new Teacher("Ella");
        payable1.makePayment(150);
        payable2.makePayment(500);

        Student.showTotalStudents();

    }
}
//Interface
interface Payable {
    void makePayment(double amount);// Method signature only, no body — any implementing class must define this
}
//Abstract Class
abstract class User{
    private String name;
    
    User(String name){
        this.name = name;// "this" refers to the current object's field, distinguishing it from the parameter with the same name
    }

    public String getName() {   // controlled read access
        return name;
    }

    public void setName(String name){// controlled write access
        this.name=name;
    }

    abstract void showRole(); // Abstract method — has no body here, must be implemented by subclasses
 
}
////Inheritance and Interface: Student inherits from User and implements Payable
class Student extends User implements Payable{
    private final int age;
    static int totalStudents = 0;// Shared counter across all Student objects  


    //Constructor 1: Just name
    Student(String name) {
        super(name);// "super" calls the parent class's (User) constructor to initialize inherited fields
        this.age=0;// default age
        totalStudents++; 
    }
    // Constructor 2: name and age
    Student(String name,int age) {
        super(name);// "super" calls the parent class's (User) constructor to initialize inherited fields
        this.age=age;
        totalStudents++; 
    }

    @Override 
    void showRole(){
        System.out.println(getName() + " is a student"+", age " + age + ".");
    }
    @Override
    public void makePayment(double amount){
        System.out.println(getName() + " paid " + amount +" TL.");
    }

    static void showTotalStudents() {//static method
        System.out.println("Total Students:" + totalStudents);
    }
}

class Teacher extends User implements Payable{// Inheritance and Interface: same pattern as Student
    Teacher(String name){
        super(name);
    }

    @Override
    void showRole(){
        System.out.println(getName() + " is a teacher.");
    }

    @Override public void makePayment (double amount){
        System.out.println(getName() + " received " + amount + " TL.");
    }
}