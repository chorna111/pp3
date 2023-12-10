public class AudioBook extends Book{
    private int minutes;
    private int seconds;
    
    public AudioBook(String title,Writer writer,int minutes,int seconds,Publisher publisher,int publicationYear){
        super(title,writer,publisher,publicationYear);
        this.minutes=minutes;
        this.seconds=seconds;

    }
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public String display(){
        return String.format("Book title:%s\nBook author:%s %s\nDuration:%d min %d sec\nPublisher:%s\nCity:%s\nPublication year:%d",super.getTitle(),super.getWriter().getWriterName(),super.getWriter().getWriterSurname(),minutes,seconds,super.getPublisher().getName(),super.getPublisher().getCity(),super.getPublicationYear());
    }

    public static void main(String[] args) {
        Publisher pub=new Publisher("Secker$Warburg","London");
        Writer w=new Writer("George","Orwell","novel");
        Book b1=new Book("1984",w,pub,1949);
        AudioBook ab1=new AudioBook(b1.getTitle(), b1.getWriter(), 59, 3,b1.getPublisher(),b1.getPublicationYear());
        System.out.println(ab1.display());
    }

    
    
}
