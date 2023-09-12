package ss07_abstract_class_interface;

public class SocialBook extends Book implements IBook {
    private String author;

    public SocialBook(String nameBook, String publisher, String yearOfPublication, String author) {
        super(nameBook, publisher, yearOfPublication);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "SocialBook{" +
                "author='" + author + '\'' +
                '}';
    }

    @Override
    public void display() {

    }
}
