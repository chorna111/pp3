public class C2 {
    int value;
    
    public C2(){
        this.value=0;

    }
    public void increase(){
        value++;
    }
    public void decrease(){
        value--;
    }
    public void increase(int n){
        value+=n;
    }
    public void decrease(int n){
        value-=n;
    }
    public int value(){
        return value;
    }
    
}
