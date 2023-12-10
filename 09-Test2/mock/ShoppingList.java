package mock;
import java.util.ArrayList;;

public class ShoppingList {
    private Product product;
    private ArrayList<Product> list;
    public ShoppingList(){
        ArrayList<Product> list=new ArrayList<Product>();
        this.list=list;
        
    }
    public Product getProduct() {
        return product;
    }
    public ArrayList<Product> getList() {
        return list;
    }
    public void add(Product product){
        list.add(product);

    }

    public String toString(){
        ArrayList<String> l=new ArrayList<String>();
        for(Product i:list){
            l.add(i.getName());
        }
        String s=String.join(",",l);
        return s;
    }
    public int total(){
        int total=0;
        for(Product i:list){
            total+=i.getQuantity();
        }
        return total;

    }


    
}
