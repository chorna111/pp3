public class Processor {

    private String brand;
    private String model;
    private double speed;
    private boolean isRunning;

    public Processor(String brand,String model,double speed){
        this.brand=brand;

        this.model=model;
        this.speed=speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }
    


    
}
