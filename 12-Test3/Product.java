import java.lang.Comparable;
import java.util.Arrays;
public class Product implements Comparable<Product> {
    private String name;
    private float price;
    public Product(String name,float price){
        this.name=name;
        this.price=price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public int compareTo(Product product){
        if(price==product.getPrice()){
            return 0;
        }else if(price<product.getPrice()){
            return 1;
        }else{
            return -1;
        }
        
    }
        
        
    
        
        
        
    
    public static void main(String[] args) {
        Product[] arr={new Product("milk",5),new Product("cheese",2),new Product("ham",9)};
        System.out.println(arr[0].getPrice());
        System.out.println(arr[1].getPrice());
        System.out.println(arr[2].getPrice());
        Arrays.sort(arr);
        System.out.println(arr[0].getPrice());
        System.out.println(arr[1].getPrice());
        System.out.println(arr[2].getPrice());

        

        

    }
    
    
}
