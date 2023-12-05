public class AudioBook extends Book{
    private int minutes;
    private int seconds;
    public AudioBook(String title,String author,int minutes,int seconds){
        super(title,author);
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
        return String.format("Book title:%s\nBook author:%s\nDuration:%d min %d sec",super.getTitle(),super.getAuthor(),minutes,seconds);
    }

    public static void main(String[] args) {
        Book b1=new Book("1984","George Orwell");
        AudioBook ab1=new AudioBook(b1.getTitle(), b1.getAuthor(), 59, 3);
        System.out.println(ab1.display());
    }

    
    
}
