package ss07_abstract_class_interface;

public class Main {
    public static void main(String[] args) {
        Book natura1 = new NaturalBook("KingDom","Nhật Bản","23/09/2003",30000);
        Book natura2 = new NaturalBook("One Piece","Nhật Bản","22/09/2004",50000);
        Book natura3 = new NaturalBook("Naruto","Hàn Quốc","21/09/2005",40000);
        Book social1 = new SocialBook("Swap","Trung Quốc","10/11/2013","Jin Lai Su");
        Book social2 = new SocialBook("Wolf","Mỹ","10/02/2004","Alex");
        Book[] bookList = {natura1,natura2,natura3,social1,social2};
        for (Book book: bookList){
            book.display();
        }

    }
    }

