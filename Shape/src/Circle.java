public class Circle extends Shape{
    private double r;

    public Circle(String name, double r) {
        this.setName(name);
        this.r = r;
    }

    public double area() {
        this.setArea(PI * r * r);
        return this.getArea();
    }
}
