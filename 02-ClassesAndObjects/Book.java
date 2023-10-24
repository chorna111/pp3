public class Book {

    String name;
    String author;
   
    int amountOfPages;
    int currentPage;
    void showCurrentPage(){
        System.out.println("The book is opened at the page "+currentPage);

    }
    void nextPage(){
        if(currentPage==amountOfPages){
            System.out.println("You are on the last page");
        }
        currentPage+=1;

    }
    void previousPage(){
        if(currentPage==amountOfPages){
            System.out.println("You are on the first page");
        }
        currentPage-=1;
    }
public static void main(String[] args) {
    Book book1=new Book();
    book1.name="The great Gatsby";
    book1.author="F. Scott Fitzgerald'";
    book1.amountOfPages=256;
    book1.currentPage=2;
    book1.showCurrentPage();
    book1.nextPage();
    book1.nextPage();
    book1.showCurrentPage();
    book1.previousPage();
    book1.showCurrentPage();



}    
}

