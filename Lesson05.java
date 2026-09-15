import java.util.Arrays;
import java.util.Scanner;

class Lesson05
{
    @SuppressWarnings("ConvertToTryWithResources")// Suppress warning for not using try-with-resources for Scanner
    public static void main(String[] args)
    {
        //Constant array example
        System.out.println("===== Constant Array Example =====");
        int[] firstGrades = {90, 95, 70, 55, 100};
        System.out.println("Constant array length: " + firstGrades.length);
        System.out.println("Last element value: " + firstGrades[firstGrades.length - 1]);

        for (int i = 0; i < firstGrades.length; i++) {
            System.out.println((i + 1) + ". student's grade: " + firstGrades[i]);
        }

        System.out.println("\n--- Current Grade List ---");
        for (int grade : firstGrades) {
            System.out.print(grade + "\t");
        }
        System.out.println("\n--------------------------\n");
        
        // Input from user for student names and grades
        System.out.println("===== Dynamic Array Example =====");
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students in the class? ");
        int numberOfStudents = scanner.nextInt();

        // Initialize arrays with the number of students
        String[] students = new String[numberOfStudents];
        int[] secondGrades = new int[numberOfStudents];

        // Input loop for student names and grades
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");
            System.out.print("Name: ");
            students[i] = scanner.next();

            System.out.print("Grade: ");
            secondGrades[i] = scanner.nextInt();
        }

        // Listing the newly entered students and their grades
        System.out.println("\n===== Newly Entered Students List =====");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println((i + 1) + ". " + students[i] + "\t Grade: " + secondGrades[i]);
        }
       
        // Sorting and searching in an array
        System.out.println("\n===== Sorting and Searching in an Array =====");
        int[] numbers = {1, 43, 4, 3, 34};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
        // Searching for a specific number in the sorted array
        int searchNumber = 34;
        System.out.println(searchNumber +" is searching in this array:" + Arrays.toString(numbers));
        System.out.println(searchNumber + " is found at index: " + Arrays.binarySearch(numbers, searchNumber));
        // Filling an array with a specific value
        int[] emptyArray = new int[7];
        int valueToFill = 10;
        Arrays.fill(emptyArray, valueToFill);
        System.out.println("Array after filling with " + valueToFill + ": " + Arrays.toString(emptyArray));
        
        
        scanner.close(); //Scanner closed to prevent resource leak

        // String manipulation examples
        System.out.println("\n===== String Manipulation Examples =====");
        String name ="      Umut Kivanch   ";
        System.out.println("Original:"+name);
        System.out.println("trim():"+ name.trim());//In the beginning and end spaces are removed.
        System.out.println("lowercase:"+name.toLowerCase());//lowercase
        System.out.println("UPPERCASE:"+name.toUpperCase());//UPPERCASE

        String email="umutklnc1234@gmail.com";
        System.out.println("Length: " + email.length());
        System.out.println("Substring (0,12): " + email.substring(0,12));//Takes the substring from the (0,12).
        System.out.println("Index of @: " + email.indexOf('@'));//Finds the index of the first occurrence of '@'.
        System.out.println("Username: " + email.substring(0,email.indexOf('@')));//Takes the substring from the beginning to the index of '@'.
        System.out.println("Domain: " + email.substring(email.indexOf('@')+1));//Takes the substring from the index of '@' + 1 to the end.
        System.out.println("Ends with .com: " + email.endsWith(".com"));//Checks if the string ends with ".com".

        String regex = "@";// Define the regex for splitting the email
        String[] parts = email.split(regex);
        System.out.println("Email parts: " + Arrays.toString(parts));
        System.out.println("Part 1: " + parts[0]);//Takes the first part of the email before the '@'.
        System.out.println("Part 2: " + parts[1]);//Takes the second part of the email after the '@'.
    }
}