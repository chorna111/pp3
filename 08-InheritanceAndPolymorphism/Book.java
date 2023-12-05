public class Book {
    private String title;
    private String author;
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String display(){
        return String.format("Book title: %s\nBook author: %s",title,author);
    }
    public static void main(String[] args) {
        Book b1=new Book("Harry Potter","Joan Rowling");
        System.out.println(b1.display());
    }
    
}
