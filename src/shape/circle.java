package shape;

public class circle extends shape
{
    protected double radius;
    public circle() {}
    public circle(double radius)
    {
        this.radius = radius;
    }
    public circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    @Override
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString()
    {
        return "\nShape: circle, radius: "+this.radius+", color: "+this.color;
    }
}