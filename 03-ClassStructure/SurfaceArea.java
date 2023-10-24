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

public class SurfaceAreaTest {
    public static void main(String[] args) {
        System.out.print("Rectangle area (5,2) is ");
        System.out.println(rectangle(5,2));
    }
}
}
