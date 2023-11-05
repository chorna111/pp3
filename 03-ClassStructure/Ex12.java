public class Ex12 {
    public static int numberOfItems(int x,int y){
        return y+1-x;
    }
    public static int sumOfNumbers(int x,int y){
        int total=0;
        for(int i=x;i<=y;i++){
            total+=i;

        }
        return total;
    }
    public static float arithmeticMean(int x, int y){
        int sum=sumOfNumbers(x, y);
        int num=numberOfItems(x, y);
        float result=(float)sum/num;
        return result;
        

    }


public static void main(String[] args) {
   
    System.out.println(sumOfNumbers(5, 10));
    System.out.println(numberOfItems(5, 10));
    System.out.println(arithmeticMean(5, 10));
}   
}
