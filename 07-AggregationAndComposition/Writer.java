public class Writer {
    private String name;
    private String surname;
    public Writer(String name,String surname){
        this.name=name;
        this.surname=surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public static void main(String[] args) {
        Writer w=new Writer("Joan", "Surname");
        Book book=new Book("Harry Potter", 2000, w);
        w=null;
        System.out.println(book.getTitle());
        System.out.println(book.getWriterName());
    }

    
    
}
