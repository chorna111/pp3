import java.util.ArrayList;;
public class BookCase {
    private String name;
    private ArrayList<Book> listOfBooks;
    
    public BookCase(String name){
        this.name=name;
        this.listOfBooks=new ArrayList<>();
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getNumberOfBooks() {
        return listOfBooks.size();
    }
    
    public void addBook(Book book){
        listOfBooks.add(book);

    }
    public void removeBook(Book book){
        listOfBooks.remove(book);
    }
    public String toString(){
        ArrayList<String> titles=new ArrayList<String>();
        for(Book b:listOfBooks){
            titles.add(b.getTitle());

        }
        
        return String.format("List of book placed on the bookcase %s:\n%s",name,String.join("\n",titles));
            
       
        }
        public static void main(String[] args) {
            BookCase c=new BookCase("Fantasy");
            System.out.println(c.getNumberOfBooks());
            Writer w=new Writer("Joan", "Rowling");
            Book book=new Book("Harry Potter and the Prisoner of Azkaban", 1999, w);
            Book book2=new Book("Harry Potter and the Goblet of Fire",2000,w);
            c.addBook(book);
            c.addBook(book2);
            System.out.println(c.getNumberOfBooks());
            System.out.println(c);
            c=null;
            System.out.println(book2.getWriterName());
           
            book.addChapter("Chapter1");
            
            System.out.println(book.getChapters());
            System.out.println(book.getChapter("Chapter1"));
            book=null;
            System.out.println(book);
        
        }
    }
    



    

