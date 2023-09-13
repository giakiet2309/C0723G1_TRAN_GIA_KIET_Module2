package ss06_inheritance.baitap1;

public class Circle {
    private double radius;
    // Thành phần được kế thừa
    private String color;

    // Thành phần được kế thừa
    public Circle() {
    }

    //overload
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    //override của Class Obj
    @Override
    public String toString() {
        return "A Circle with radius ="
                + this.radius
                + "And color is" + this.color;
    }
}
