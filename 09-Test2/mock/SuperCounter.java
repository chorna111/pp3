package mock;

public class SuperCounter extends Counter{

    public SuperCounter(int value){
        super(value);
    }
    public void addN(int n){
        for(int i=0;i<n;i++){
            add1();
        }
    }

    public static void main(String[] args) {
        SuperCounter superCounter = new SuperCounter(5);
        superCounter.addN(3);
        System.out.println(superCounter.getCounter());
        
    }

    
}
