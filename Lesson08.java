import java.util.ArrayList;
import java.util.Scanner;

public class Lesson08{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Shared Scanner, avoids conflicts
        ArrayList <String> list =new ArrayList<>(); // Resizable list, no fixed size needed
 
        ListWorks listWorks = new ListWorks(list, scanner); // Dependency injection
        Menu menu = new Menu(listWorks, scanner);
        menu.manageMenu();
       
    }
}
// Menu: handles only user interaction
class Menu{
    Scanner scanner;
    ListWorks listWorks;

    Menu(ListWorks listWorks,Scanner scanner) {
        this.listWorks=listWorks;
        this.scanner=scanner;
    }
    




    void manageMenu(){
        while (true){
            System.out.println("1 - Show List\n2 - Add Product\n3 - Remove Product\n4 - Search Product\n5 - Exit");
            String command = scanner.next().trim();
            switch (command) {
                case "1" -> listWorks.showList();
                case "2" -> listWorks.add();
                case "3" -> listWorks.removeProduct();
                case "4" -> listWorks.searchProduct();
                case "5" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid command.");
            }
        }
    }

}

class ListWorks{
    Scanner scanner;
    ArrayList<String> list;

    ListWorks(ArrayList<String> list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    void add(){
        
        System.out.println("Type a product name to add it, or enter 'q' to quit.");
        while (true) {
            System.out.println("Product Name:");
            String element = scanner.next().trim();
            if (element.equalsIgnoreCase("q"))
                break;
            if (element.isEmpty())
                continue;
            list.add(element);
        }
    }

    void showList(){
        if (list.isEmpty()) {
            System.out.println("Your list is empty.");
        }
        else{
            System.out.println("---------------Shopping List---------------");
            for (String item : list) {
                System.out.println(item);
            }
        }
    }

    void removeProduct(){
        if (list.isEmpty()) {
            System.out.println("Your list is empty, nothing to remove.");
            return;
        }
        System.out.println("Product name to remove:");
        String productToRemove = scanner.next().trim();

        boolean removed = list.remove(productToRemove);// remove(String)=by value, remove(int)=by index
        if (removed) {
            System.out.println(productToRemove + " has been removed from your list.");
        } else {
            System.out.println(productToRemove + " was not found in your list.");
        }
    }


    void searchProduct(){
        if (list.isEmpty()) {
            System.out.println("Your list is empty.");
            return;
        }
        System.out.println("Product name to search:");
        String searchingProduct = scanner.next().trim();

        if (list.contains(searchingProduct)) {
            System.out.println(searchingProduct + " is in your list.");
        } else {
            System.out.println(searchingProduct + " is not in your list.");
        }

    }
}