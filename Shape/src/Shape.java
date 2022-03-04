public abstract class Shape {
    private double area;
    private String name;
    public static final double PI = 3.1415926536;

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return this.name;
    }

    public double getArea() {
        return this.area;
    }
}