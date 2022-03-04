public class Rectangle extends Shape implements Comparable{
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        this.setName(name);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double area() {
        this.setArea(this.width * this.height);
        return this.getArea();
    }

    @Override
    public String compareTo(Rectangle a){
        if(a.getArea() > this.getArea())
            return a.getName();
        else
            return this.getName();
    }
}
