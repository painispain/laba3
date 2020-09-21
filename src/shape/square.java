package shape;

public class square extends rectangle
{
    public square() {}
    public square(double side)
    {
        this.width = side;
        this.length = side;
    }
    public square(double side, String color, boolean filled)
    {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide()
    {
        return width;
    }
    public void setSide(double side)
    {
        this.width = side;
        this.length = side;
    }
    public void setLength(double side)
    {
        this.length = side;
    }
    public void setWidth(double side)
    {
        this.width = side;
    }
    @Override
    public double getArea()
    {
        return width*length;
    }
    @Override
    public double getPerimeter()
    {
        return 4*width;
    }
    @Override
    public String toString()
    {
        return "\nShape: square, side: "+this.width+", color: "+this.color;
    }
}