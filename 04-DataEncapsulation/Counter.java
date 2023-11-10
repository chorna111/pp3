public class Counter {
    private int value;

    public Counter(){
        this.value=0;
    }
    public void increase(){

        this.value+=1;
        
        
    }
    public void increase(int n){
        this.value+=n;

    }
    public void decrease(){
        this.value-=1;
    }
    public void decrease(int n){
        this.value-=n;
    }
    public int value(){
        return this.value;
    }
    
    


    
}
