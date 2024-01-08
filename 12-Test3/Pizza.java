public class Pizza extends Food implements Extra{
    private int size;
    public Pizza(String name,int size){
        super(name);
        this.size=size;

    }


    public void setPrice(float price){
        this.price=price;
        
        
        

    };
    public float discount(){
        if(price>=30){
            return (float)0.05*price;
        }else{
            return 0;
        }
    }
    public float delivery(){
        
        if(size<50){
            return 6;
            
        }else{
            return 8;
        }
    }
    public float delivery(int tip){
        if(size<50){
            return 6+tip;
        }else{
            return 8+tip;
        }
        
    }

    
}
