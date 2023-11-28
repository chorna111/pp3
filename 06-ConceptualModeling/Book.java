public class Book{
    private String title;
    private String author;
    private String genre;
    private int pubYear;
    private float price;

    public Book(String title,String author,String genre,int pubYear,float price){
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.pubYear=pubYear;
        this.price=price;
    }

    public String display(){
        return String.format("Book name: %s\nAuthor: %s\nGenre: %s\nPublished at: %s\nPrice: %s",title,author,genre,pubYear,price);
    }
    public static void main(String[] args) {
        Book book1=new Book("Harry Potter","Joan Rowling","fantasy",2000,200);
        System.out.println(book1.display());
    }

}