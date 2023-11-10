public class Point {
    int x;
    int y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;

    }
    public boolean isX(){
        if(x==0){
            return true;
        }else{
            return false;
        }

    }
    public boolean isY(){
        if(y==0){
            return true;

        }else{
            return false;
        }
    }
    public String toString(){
        return String.format("P(%d,%d)",x,y);
    }
    public static void main(String[] args) {
        Point p1=new Point(3, 0);
        System.out.println(p1.isX());
        System.out.println(p1.isY());
        System.out.println(p1);

    }
}
