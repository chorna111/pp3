import java.util.ArrayList;
public class Library {
    static ArrayList<Book> storage=new ArrayList<Book>();


    public String display(){
        String output="";
        for(Book book:storage){
            output+=book.display()+"\n";
        }

        return output;

    }
    public static void main(String[] args) {
        Library lib=new Library();
        Book b1=new Book("Harry Potter","Joan Rowling");
        Ebook eb1=new Ebook("1984","George Orwell","1984.txt");
        Ebook eb2=new Ebook("The night in Lisbon","E.M.Remarque","night.txt");
        AudioBook ab1=new AudioBook(b1.getTitle(), b1.getAuthor(), 60, 35);
        storage.add(b1);
        storage.add(eb1);
        storage.add(eb2);
        storage.add(ab1);
        System.out.println(lib.display());

    }


    
}
