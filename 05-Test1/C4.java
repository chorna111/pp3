public class C4 {


    public static int even(int[] array){
        int total=0;
        for(int value:array){
            if(value%2==0){
                total+=1;
            }

        }
        return total;
    }
    public static int positiveOdd(int[] array){
        int total=0;
        for(int value:array){
            if(value>0){
                if(value%2!=0){
                    total+=1;
                }
            }
        }
        return total;

    }
    
}
