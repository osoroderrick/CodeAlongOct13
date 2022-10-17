package openClosedPrinciple;

public class Rectangle implements Shape{
    public Double height;
    public Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculate() {
        System.out.println(height * width);
    }
}
