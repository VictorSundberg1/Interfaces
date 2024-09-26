public class Circle implements Shape{
    double radie;

    public Circle(double radie) {
        this.radie = radie;
    }

    @Override
    public double area() {
        return radie * radie * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * radie * Math.PI;
    }
}
