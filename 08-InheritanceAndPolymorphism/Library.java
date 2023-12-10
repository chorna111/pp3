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
        Writer w1=new Writer("Joan" ,"Rowling","fantasy");
        Writer w2=new Writer("George ","Orwell","novel");
        Library lib=new Library();
        Publisher p1=new Publisher("Ababahalamaha","Lviv");
        Book b1=new Book("Harry Potter",w1,p1,1997);
        Ebook eb1=new Ebook("1984",w2,"1984.txt",p1,1949);
        Ebook eb2=new Ebook(b1.getTitle(),b1.getWriter(),"night.txt",b1.getPublisher(),1950);
        AudioBook ab1=new AudioBook(b1.getTitle(), b1.getWriter(), 60, 35,b1.getPublisher(),b1.getPublicationYear());
        storage.add(b1);
        storage.add(eb1);
        storage.add(eb2);
        storage.add(ab1);
        System.out.println(lib.display());

    }


    
}

