public class Ebook extends Book{
    private  String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;

    }

    public Ebook(String title,Writer writer,String fileName,Publisher publisher,int publicationYear){
        super(title,writer,publisher,publicationYear);
        this.fileName=fileName;
        
    }
    public String display(){
        return String.format("Ebook title: %s\nEbook author:%s %s\nEbook file name: %s\nPublisher:%s\nCity:%s\nPublication year:%d",super.getTitle(),super.getWriter().getWriterName(),super.getWriter().getWriterSurname(),fileName,super.getPublisher().getName(),super.getPublisher().getCity(),super.getPublicationYear());
    }

   

    

    
}

    

    

