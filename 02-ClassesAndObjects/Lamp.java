public class Lamp {
    boolean isOn;
    boolean isOff;
    void turnOn(){
       isOn=true;
       isOff=false;
    }
    void turnOff(){
        isOn=false;
        isOff=true;
    }
    void display(){
        String displayInfo=(isOn)?"on":"off";
        System.out.println("The lamp is "+displayInfo);    
    }
    public static void main(String[] args) {
        Lamp lamp1=new Lamp();
        Lamp lamp2=new Lamp();
        lamp1.turnOn();
        lamp2.turnOff();
        lamp1.display();
        lamp2.display();

    }
}
