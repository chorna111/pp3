import java.util.ArrayList;
public class Book {
    private String title;
    private int year;
    private Writer writer;
    private ArrayList<Chapter> chapters;
    

    public Book(String title,int year,Writer writer){
        this.title=title;
        this.year=year;
        this.writer=writer;
        chapters=new ArrayList<Chapter>();

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
     
    public Chapter getChapter(String name) {
        for (Chapter c : chapters) {
            String chapterTitle = c.getTitle();
            if (chapterTitle.equals(name)) {
                return c;
                
            }
        }
        return null; // Return null if no matching chapter is found
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
    public void addChapter(String name){
        Chapter newc=new Chapter(name);
        
        chapters.add(newc);
    }
    public ArrayList<Chapter>  getChapters(){
        return chapters;
    }
}

   



    
    

