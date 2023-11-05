public class InternetDevice {
    public String name;
    public boolean connected;
    public static int connectedDevices=0;
    public InternetDevice(String name){
        this.name=name;
        this.connected=false;

    }
    public void connect(){
        if(!connected){

        
        
            connected=true;
            connectedDevices++;
        }    

    }
        
    
    public void disconnect(){
        if(connected){
            connected=false;
            connectedDevices--;

        }
    }
    public boolean isConnected(){


        return connected;

    }


    public void displayStatus(){
        System.out.println(name+" is "+(connected ? "connected" : "disconnected"+" to the Internet"));
    }
    public static void displayConnections() {
        System.out.println("Total devices connected to the Internet: " + connectedDevices);
    }
    
    
   
    public static void main(String[] args) {
        InternetDevice iphone11=new InternetDevice("Iphone 11");
        InternetDevice comp=new InternetDevice("Computer");
        InternetDevice tablet=new InternetDevice("Tablet");
        InternetDevice laptop=new InternetDevice("Laptop");
        InternetDevice iphone12=new InternetDevice("Iphone 12");
        iphone11.connect();
         displayConnections();
        comp.connect();
        tablet.connect();
       
        iphone11.displayStatus();
        comp.displayStatus();
        tablet.displayStatus();
        laptop.displayStatus();
        iphone12.displayStatus();
        displayConnections();

    
        



    }
    
    





    
}

