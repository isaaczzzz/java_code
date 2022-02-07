public abstract class Shape {
    public double area;
    public String name;
    public static final double PI = 3.1415926536;

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("r1", 2.0, 3.0);
        Rectangle r2 = new Rectangle("r1", 2.0, 4.0);
        Circle c = new Circle("c", 2.0);

        System.out.println("Area of the circle is " + c.area());
        System.out.println("Area of the first Rectangle is " + r1.area());

        System.out.println("The larger one is: " + r1.compareTo(r2));
    }
}

interface Comparable {
    String compareTo(Rectangle a);
}

class Rectangle extends Shape implements Comparable{
    double width;
    double height;

    public Rectangle(String s, double x, double y) {
        this.name = s;
        this.width = x;
        this.height = y;
    }

    public double area() {
        this.area = this.width * this.height;
        return this.area;
    }

    @Override
    public String compareTo(Rectangle a){
        if(a.area > this.area)
            return a.name;
        else
            return this.name;
    }
}

class Circle extends Shape{
    double r;

    public  Circle(String s, double x) {
        this.name = s;
        this.r = x;
    }

    public double area() {
        this.area = PI * r * r;
        return this.area;
    }
}