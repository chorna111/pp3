public class Book {
    private String title;
    
    private Publisher publisher;
    private int publicationYear;
    private Writer writer;
    public Book(String title,Writer writer,Publisher publisher,int publicationYear){
        this.title=title;
        this.writer=writer;
        this.publisher=publisher;
        this.publicationYear=publicationYear;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
 
    public Publisher getPublisher() {
        return publisher;
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    public String display(){
       
            return String.format("Book title: %s\nBook author: %s %s\nPublisher: %s\nCity:%s\nPublication year:%d",
                    title, writer.getWriterName(), writer.getWriterSurname(), publisher.getName(), publisher.getCity(), publicationYear);
        
        
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public Writer getWriter() {
        return writer;
    }
    public void setWriter(Writer writer) {
        this.writer = writer;
    }
    
    
    
    public static void main(String[] args) {
        Writer w1=new Writer("Joan","Rowling","fantasy");
        Publisher p1=new Publisher("Ababahalamaha","Lviv");
        
        Book b1=new Book("Harry Potter",w1,p1,1997);
        System.out.println(b1.display());
    }
    
    
    
}
