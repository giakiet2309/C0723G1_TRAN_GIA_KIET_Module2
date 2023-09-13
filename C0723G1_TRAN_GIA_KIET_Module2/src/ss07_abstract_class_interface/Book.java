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


    @Override
    public String toString() {
        return
                "Tên sách : " + nameBook + '\n' +
                "Nhà xuất bản : " + publisher + '\n' +
                "Năm sản xuất : " + yearOfPublication + '\n';
    }

}
