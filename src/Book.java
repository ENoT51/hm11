public class Book {
   private String bookTitle;
   private Author nameOfAuthor;
   private int publicationYear;
public Book (String bookTitle, Author nameOfAuthor, int publicationYear) {
    this.bookTitle = bookTitle;
    this.publicationYear = publicationYear;
    this.nameOfAuthor = nameOfAuthor;
}
    public String getBookTitle() {
        return bookTitle;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Author getNameOfAuthor(){
        return nameOfAuthor;
    }
    public void setPublicationYear(int publicationYear){
    this.publicationYear = publicationYear;
    }

}
