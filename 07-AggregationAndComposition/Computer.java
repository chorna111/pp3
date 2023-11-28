public class Computer{
    
    private Processor processor;
    private String type;
    private String model;
    private int ram;
    private boolean turnedOn;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public Computer(String type,String model,int ram){
        processor=new Processor("Intel","Intel core",2.5);
        this.type=type;
        this.model=model;
        this.ram=ram;
        turnedOn=false;
    }
    public Processor getProcessor(){
        return processor;

    }

    public void turnOn(){
        turnedOn=true;
        processor.setRunning(true);
        
    }
    public void shutDown(){
        turnedOn=false;
        processor.setRunning(false);
    }

    public static void main(String[] args) {
        Computer c=new Computer("Laptop","Macbook Air",8);
        Processor p =c.getProcessor();
        System.out.println(p.getBrand());
    }
}