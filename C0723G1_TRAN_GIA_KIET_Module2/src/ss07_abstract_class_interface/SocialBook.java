package ss07_abstract_class_interface;

public class SocialBook extends Book implements IBook {
    private String author;

    public SocialBook(String nameBook, String publisher, String yearOfPublication, String author) {
        super(nameBook, publisher, yearOfPublication);
        this.author = author;
    }

    @Override
    public void display() {
        System.out.println(super.toString() + "Tác giả : " + this.author + '\n');
    }
}
