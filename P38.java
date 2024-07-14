//38.	Calculate area and circumference of circle using multiple classes
class Circle 
{
    double radius;
    public Circle(double radius)
    {
        this.radius= radius;
    }
    public double calculateArea()
    {
        return Math.PI*radius*radius;
    }
    public double calculateCircum()
    {
        return 2*Math.PI*radius;
    }
}
public class P38
{
    public static void main(String[] args) {
        Circle c1 = new Circle(5.2);
        double area = c1.calculateArea();
        double circum = c1.calculateCircum();

        System.out.println("Area of circle : "+area);
        System.out.println("Circumference of circle : "+circum);
    }
}