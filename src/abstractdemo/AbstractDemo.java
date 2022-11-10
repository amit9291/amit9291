package abstractdemo;

abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    @Override
     void draw() {
        System.out.println("drawing rectangle");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("drawing circle ");
    }
}
public class AbstractDemo {
    public static void main (String[] args){
        Shape s=new Rectangle();
        Shape s1 =new Circle();
        s.draw();
        s1.draw();

    }
}
