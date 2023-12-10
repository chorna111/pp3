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
        int[] array=new int[2];
        array[0]=super.getSeats();
        array[1]=maxSpeed;
        return array;
    }
    
}
