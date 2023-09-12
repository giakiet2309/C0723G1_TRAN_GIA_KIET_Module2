package ss07_abstract_class_interface;

public abstract class Book implements IBook{
    private String nameBook;

    private String publisher;

    private String yearOfPublication;

    public Book(String nameBook, String publisher, String yearOfPublication) {
        this.nameBook = nameBook;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearOfPublication='" + yearOfPublication + '\'' +
                '}';
    }

}
