public class Computer{
    
    private Processor processor;
    private String type;
    private String model;
    private int ram;
    private boolean turnedOn;
    public Computer(){
        processor=new Processor();

    }
    public Processor getProcessor() {
        return processor;
    }
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
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
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.processor.setModel("Intel");
     
       

    }
    
}

    
    