public class Book {
    private String title;
    private int year;
    private Writer writer;

    public Book(String title,int year,Writer writer){
        this.title=title;
        this.year=year;
        this.writer=writer;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Writer getWriter() {
        return writer;
    }
    public String getWriterName(){
        return writer.getName();
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }



    
    
}
