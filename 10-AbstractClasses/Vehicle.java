public abstract class Vehicle {
    
    private String color;
    private int year;
    
    public Vehicle(String color,int year){
    
        this.color=color;
        this.year=year;


    }

    public abstract String display();

    
    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
    

    
}
