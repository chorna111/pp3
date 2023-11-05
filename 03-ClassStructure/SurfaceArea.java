import java.lang.Math;
public class SurfaceArea {
    static float rectangle(float a, float b){
        return a*b;
    }


    static float triangle(float height,float base){
        float areaOfTriangle=(float)0.5*height*base;
        return areaOfTriangle;
    }

    static double circle(float radius){
        double areaOfCircle=Math.PI*Math.pow(radius,2);
        return areaOfCircle;
    }


    static double cuboid(float length,float breadth, float height){
        double areaOfCuboid=2*(length*breadth+breadth*height+height*length);
        return areaOfCuboid;


    
    }


    static double cuboid(float side){
        double areaOfCuboid=2*3*Math.pow(side,2);
        return areaOfCuboid;
    }

    static double sphere(float radius){
        return Math.PI*Math.pow(radius,2)*4;
    }

    
    static double cone(float radius,float height,float slantHeight){
        return Math.PI*radius*(slantHeight+radius);

    }



public class SurfaceAreaTest {
    public static void main(String[] args) {
        System.out.print("Rectangle area (5,2) is ");
        System.out.println(rectangle(5,2));
        System.out.print("Cuboid area (5,2) is ");
        System.out.println(cuboid(5,2,3));
        System.out.print("Sphere area is ");
        System.out.println(sphere(5));
        System.out.print("Cone area  is ");
        System.out.println(cone(5,2,3));
    }
}
}
