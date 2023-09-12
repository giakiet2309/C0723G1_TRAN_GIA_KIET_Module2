package ss07_abstract_class_interface;

public class NaturalBook extends Book implements IBook {
    private String numberOfPublication;

    public NaturalBook(String nameBook, String publisher, String yearOfPublication, String numberOfPublication) {
        super(nameBook, publisher, yearOfPublication);
        this.numberOfPublication = numberOfPublication;
    }

    public String getNumberOfPublication() {
        return numberOfPublication;
    }

    public void setNumberOfPublication(String numberOfPublication) {
        this.numberOfPublication = numberOfPublication;
    }

    @Override
    public String toString() {
        return "NaturalBook{" +
                "numberOfPublication='" + numberOfPublication + '\'' +
                '}';
    }

    @Override
    public void display() {

    }
}
