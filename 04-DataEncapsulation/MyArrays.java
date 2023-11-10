public class MyArrays {
    public static int odd(int[] array){
        int n=0;
        for(int i:array){
            if(i>0){
                if(i%2!=0){
                    n++;
                }
            }
        }
        return n;
    }
    public static int above(int[] array){
        int sum=0;
        for(int i:array){
            sum+=i;
        }
        double mean=sum/array.length;
        int output=0;
        for(int j:array){
            if(j>mean){
                output+=j;
            }

        }
        return output;
    }
    public static void main(String[] args) {
        int[] array1={3,2,-5,4,1,-7};
        int[] array2={5,2,7,4,2};
        System.out.println(odd(array1));
        System.out.println(above(array2));
    }
    
    
    
}
