public class Rectangle {
    int side1;
    int side2;
    void displayInfo(){
        System.out.printf("Dimensions: %dx%d%nPerimeter: %d%nSurface area: %d%n",side1,side2,(side1+side2)*2,side1*side2);
    }

    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle();
        Rectangle rectangle2=new Rectangle();
        rectangle1.side1=3;
        rectangle1.side2=4;
        rectangle1.displayInfo();
        rectangle2.side1=2;
        rectangle2.side2=7;
        rectangle2.displayInfo();



    }
}
