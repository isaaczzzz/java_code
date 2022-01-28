public class Circle extends Shape{
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
