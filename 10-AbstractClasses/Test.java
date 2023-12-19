public class Test {

    public static void main(String[] args) {
        Triangle t=new Triangle(2, 3,5,4);
        Rectangle r= new Rectangle(30, 90.6);
        Circle c=new Circle(5.6);
        System.out.printf("Areas for shapes:\nTriangle: %.02f\nRectagle: %.02f\nCircle: %.02f",t.area(),r.area(),c.area());

    }
    
}
