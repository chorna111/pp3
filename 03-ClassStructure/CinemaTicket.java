public class CinemaTicket {
    static String name="Multiplex";
    String title;
    int row;
    int seat;
    int price;

    public String toString() {
        return "Cinema: " + name + "\nFilm Title: " +title + "\nRow: " + row + "\nSeat: " + seat + "\nPrice: $" + price;
    }
    

    public static void main(String[] args) {
        CinemaTicket ticket1=new CinemaTicket();
        CinemaTicket ticket2=new CinemaTicket();
        ticket1.title="Duna";
        ticket1.row=12;
        ticket1.seat=12;
        ticket1.price=130;
        ticket2.title="Pulp Fiction";
        ticket2.row=1;
        ticket2.seat=2;
        ticket2.price=100;
        System.out.println("Ticket 1:\n" + ticket1);
        System.out.println("Ticket 2:\n" + ticket2);
        
        
    }


    
}
