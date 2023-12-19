public class Triangle extends Shape {
    private float base;
    private float height;
    private float side1;
    private float side2;

    public Triangle(float base,float side1,float side2,float height){
        this.base=base;
        this.height=height;
        this.side1=side1;
        this.side2=side2;
    }
    

    public float getSide1() {
        return side1;
    }


    public float getSide2() {
        return side2;
    }


    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public double area(){
        return 0.5*base*height;
    }
    public double perimeter(){
        return side1+side2+height;
    }   
    
    
}
