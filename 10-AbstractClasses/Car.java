public class Car extends Vehicle{
    private String model;
    public Car(String color,int year,String model){
        super(color,year);
        this.model=model;


    }
    public String getModel() {
        return model;
    }
    public String display(){
        return String.format("Car model: %s\nCar color: %s\nYear: %d",getModel(),super.getColor(),super.getYear());
    }

    
}
