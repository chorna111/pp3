public class Chapter {
    private String title;
    private int numberOfPages;
    private int startingPageNumber;
     
    public Chapter(String title){
        this.title=title;
        
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
   
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public int getStartingPageNumber() {
        return startingPageNumber;
    }
    public void setStartingPageNumber(int startingPageNumber) {
        this.startingPageNumber = startingPageNumber;
    }
    



    
}
