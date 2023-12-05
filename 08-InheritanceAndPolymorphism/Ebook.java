public class Ebook extends Book{
    private  String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;

    }

    public Ebook(String title,String author,String fileName){
        super(title,author);
        this.fileName=fileName;
        
    }
    public String display(){
        return String.format("Ebook title: %s\nEbook author:%s\nEbook file name: %s",super.getTitle(),super.getAuthor(),fileName);
    }

    public static void main(String[] args) {
        Book b1=new Book("Harry Potter","Joan Rowling");
        Ebook eb1=new Ebook(b1.getTitle(),b1.getAuthor(),"hp.txt");
        System.out.println(eb1.display());
        Ebook eb2=new Ebook("1984","George Orwell","1984.txt");
        System.out.println(eb2.display());
    }

    

    
}
