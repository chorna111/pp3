public class ProductTest {
    public static void main(String[] args) {
        Product product1=new Product();
        product1.setName("potato");
        product1.setVegetarian(true);
        Product product2=new Product();
        product2.setName("chicken breast");
        product2.setVegetarian(false);
        System.out.println("Your product is "+product1.getName()+" and it's "+(product1.isVegetarian()?"vegetarian":"not vegetarian."));
        System.out.println("Your product is "+product2.getName()+" and it's "+(product2.isVegetarian()?"vegetarian":"not vegetarian."));
        
    }

    
}
