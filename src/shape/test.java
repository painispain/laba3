package shape;

public class test
{
    public static void main(String[] args)
    {
        shape s1 = new circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
//        System.out.println(s1.getRadius()); // В абстрактном суперклассе "Shape" нет метода "getRadius()"

        circle c1 = (circle) s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

//        Shape s2 = new Shape(); // Абстрактный суперкласс "Shape" не может быть инициализирован,
        // т.к. он предназначен для использования в качестве базового класса для других классов

        shape s3 = new rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
//        System.out.println(s3.getLength()); // В абстрактном суперклассе "Shape" нет метода "getLength()"

        rectangle r1 = (rectangle) s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        shape s4 = new square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
//        System.out.println(s4.getSide()); // В абстрактном суперклассе "Shape" нет метода "getSide()"

        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square
        rectangle r2 = (rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
//        System.out.println(r2.getSide()); // В абстрактном суперклассе "Shape" нет метода "getSide()"
        System.out.println(r2.getLength());

        // Downcast Rectangle r2 to Square
        square sq1 = (square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}