public class Writer {
    String writerName;
    String writerSurname;
    String genre;
    public Writer(String writerName,String writerSurname,String genre){
        this.writerName=writerName;
        this.writerSurname=writerSurname;
        this.genre=genre;
    }
    public String getWriterName() {
        return writerName;
    }
    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }
    public String getWriterSurname() {
        return writerSurname;
    }
    public void setWriterSurname(String writerSurname) {
        this.writerSurname = writerSurname;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
}

