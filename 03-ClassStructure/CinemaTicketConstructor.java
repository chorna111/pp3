public class CinemaTicketConstructor {


        static String name="Multiplex";
        String title;
        int row;
        int seat;
        int price;
    
        public String toString() {
            return "Cinema: " + name + "\nFilm Title: " +title + "\nRow: " + row + "\nSeat: " + seat + "\nPrice: $" + price;
        }
        public CinemaTicketConstructor(String title,int row,int seat){
            this.title=title;
            this.row=row;
            this.seat=seat;

            if(row<=2){
                this.price=10;
            }else{
                this.price=25;
            }
            }
        
        
    
        public static void main(String[] args) {
            CinemaTicketConstructor ticket1 = new CinemaTicketConstructor("Pulp fiction", 2, 7);
            CinemaTicketConstructor ticket2 = new CinemaTicketConstructor("Pulp Fiction", 7, 5);
    

            System.out.println("Ticket 1:\n" + ticket1);
            System.out.println("Ticket 2:\n" + ticket2);
            
            
        }
    
    
        
    }
    


    

