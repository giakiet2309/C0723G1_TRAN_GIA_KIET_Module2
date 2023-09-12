package ss06_inheritance.baitap1;

public class Cylinder extends Circle {
    private double height;
//    thành phần không được kế thừa

    public Cylinder() {

    }

    //overload
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    //override của Circle
    @Override
    public String toString() {
        return "A Cylinder with height is"
                + this.height
                + ", which is a subclass of"
                + super.toString();
    }
}
