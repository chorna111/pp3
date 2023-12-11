package mock;

public class Car extends Vehicle {
    private int maxSpeed;
    public Car(int seats,int maxSpeed){
        super(seats);
        this.maxSpeed=maxSpeed;
        
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int[] spec(){
        int[] array={getSeats(),maxSpeed};
        return array;
    }
    
}
