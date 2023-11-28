import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    private ArrayList<String> listOfProducts;
    public ShoppingList(){
        listOfProducts=new ArrayList<String>();
    }

    

 
    public ArrayList<String> display(){
        return listOfProducts;
    }
    public int numberOfProducts(){
        return listOfProducts.size();
    }
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the product to your shopping list: ");
        String product = scanner.nextLine(); // Use nextLine() to capture the entire line
    
        listOfProducts.add(product);
    }
    public static void main(String[] args) {
        ShoppingList list1=new ShoppingList();
        System.out.println(list1.display());
        System.out.println(list1.numberOfProducts());
        list1.addProduct();
        list1.addProduct();
        list1.addProduct();
        System.out.println(list1.display());

        System.out.println(list1.numberOfProducts());
        list1.addProduct();
        System.out.println(list1.display());
        System.out.println(list1.numberOfProducts());
    }

    
}
