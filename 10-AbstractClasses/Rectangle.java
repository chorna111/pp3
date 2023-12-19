public class Rectangle extends Shape {
    private double a;
    private double b;
    public Rectangle(double a,double b){
        this.a=a;
        this.b=b;
    }
    



    public double getA() {
        return a;
    }




    public void setA(float a) {
        this.a = a;
    }




    public double getB() {
        return b;
    }




    public void setB(float b) {
        this.b = b;
    }




    public double area() {
        return a*b;
        
    }
    public double perimeter(){
        return (a+b)*2;
    }
    
    
}
