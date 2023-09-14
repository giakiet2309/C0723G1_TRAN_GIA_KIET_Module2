package ss07_abstract_class_interface;

public class NaturalBook extends Book  {
    private int numberOfPublication;

    public NaturalBook(String nameBook, String publisher, String yearOfPublication, int numberOfPublication) {
        super(nameBook, publisher, yearOfPublication);
        this.numberOfPublication = numberOfPublication;
    }

    @Override
    public void display() {
        System.out.println(super.toString() + "Số lượng xuất bản : " + this.numberOfPublication + '\n');
    }
}
