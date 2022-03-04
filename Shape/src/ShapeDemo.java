public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("r1", 2.0, 3.0);
        Rectangle r2 = new Rectangle("r2", 2.0, 4.0);
        Circle c = new Circle("c", 2.0);

        System.out.println("Area of the circle is " + c.area());
        System.out.println("Area of the first Rectangle is " + r1.area());
        System.out.println("Area of the second Rectangle is " + r2.area());
        System.out.println("The larger one is: " + r1.compareTo(r2));
    }
}
