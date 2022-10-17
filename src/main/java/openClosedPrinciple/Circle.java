package openClosedPrinciple;

public class Circle implements Shape{
    public Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public void calculate() {
        System.out.println(radius * radius * 3.14);
    }
}
