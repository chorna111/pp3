public class Counter {
    int value=0;
    void reset(){
        value=0;
    }
    void setValue(int value){
        this.value=value;

        
    }
    
    void increaseByOne(){
        value++;
    }
    void decreaseByOne(){
        value--;
    }
    void increaseByTen(){
        value+=10;
    }
    void decreaseByTen(){
        value-=10;
    }
    int getValue(){
        return value;
    }
   

    public static void main(String[] args) {
        var count=new Counter();
        while(count.getValue()<23){
            count.increaseByOne();;

            }
        
        System.out.println("Value: "+count.getValue());
        var count2=new Counter();
        while(count2.getValue()>-47){
            count2.decreaseByOne();

            }
        System.out.println("Value: "+count2.getValue());
        //var count3=new Counter();
        //count3.setValue(45);
        //System.out.println("Value: "+count3.getValue());
    }
    
}
