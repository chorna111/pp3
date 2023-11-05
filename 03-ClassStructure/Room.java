public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;
    public Room(int number){
        this.number=number;
        beds=2;


    }
    public Room(int number,int beds){
        this.number=number;
        this.beds=beds;
    }
    public void checkIn(String guestName){
        this.guestName=guestName;
        occupied=true;
    }
    public void checkOut(){

        occupied=false;
    }
    public String isOccupied(){
        if(occupied){
            return "is occupied";
        }else{
            return "is not occupied";
        }
        
    }
    public void displayStatus(){
        System.out.println("The room number is "+number+"; Number of beds is "+beds+"; The room is "+(occupied?"occupied; ":"free; ")+(occupied?"The guest's name is "+guestName:"No guests"));
    }
    public String toString() {
        String g;
        if (occupied) {
            g = String.format("The guest's name is %s", guestName);
        } else {
            g = "No guests";
        }
    
        return String.format("The room number is %d; Number of beds is %d; The room %s; %s", number, beds, (occupied ? "is occupied" : "is vacant"), g);
    }
    
    
       
    public static void displayList(Room[] rooms){
        for(Room room:rooms){
            room.displayStatus();
        }
    }
    

        
 
    public static void displayRoomByBeds(Room[] rooms){
        System.out.println("Rooms with one bed:");
        for(Room room:rooms){
            if(room.beds==1){
                
                room.displayStatus();
            }
        }
        System.out.println("Rooms with two beds:");
        for(Room room:rooms){
            if(room.beds==2){
                room.displayStatus();
            }
        }
        System.out.println("Rooms with three beds:");
        for(Room room:rooms){
            if(room.beds==3){
                room.displayStatus();
            }
        }



    }
    public static void displayStatus(Room[] rooms){
        int unavailable=0;
        int free=0;
        for(Room room:rooms){
            if(room.occupied==true){
               unavailable+=1;
            }else{
                free++;
            }
        }
        System.out.println("There are "+unavailable+" occupied rooms and "+free+" vacant rooms");
    }
    public static void displayvacantBeds(Room[] rooms){
        int freeBeds=0;
        for(Room room:rooms){
            if(room.occupied==false){
                freeBeds+=room.beds;
            }
        }
        System.out.println("There are "+freeBeds+" available beds");
    }
  
    public static void main(String[] args) {
        Room[] rooms = new Room[6];
        Room room1=new Room(1);
        Room room2=new Room(2);
        Room room3=new Room(3);
        Room room4=new Room(4,3);
        Room room5=new Room(5,3);
        Room room6=new Room(6,1);

        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
        rooms[5] = room6;
        room2.checkIn("Antonio");
        room5.checkIn("Harry");
        room3.checkIn("Robert");
        room3.checkOut();
        room1.displayStatus();
        displayList(rooms);
        displayRoomByBeds(rooms);
        displayvacantBeds(rooms);
        displayStatus(rooms);
        room3.checkIn("Maria");
        displayStatus(rooms);
        System.out.println(room1);
        
    
}
}
