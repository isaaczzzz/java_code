public class Rectangle extends Shape implements Comparable{
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
