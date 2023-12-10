package mock;

public class Arrays {
    private int[] arr1;
    private int[] arr2;

    

    public int[] getArr1() {
        return arr1;
    }

    public void setArr1(int[] arr1) {
        this.arr1 = arr1;
    }

    public int[] getArr2() {
        return arr2;
    }

    public void setArr2(int[] arr2) {
        this.arr2 = arr2;
    }

    public Arrays(int[] arr1,int[] arr2){
        this.arr1=arr1;
        this.arr2=arr2;


    }

    public static boolean arr(int[] arr1,int[] arr2){
        int t1=0;
        for(int n:arr1){
            if(n>=10&&n<=99){
                t1++;
            }


        }
        int t2=0;
        for(int n:arr2){
            if(n>=10&&n<=99){
                t2++;

            }
        }
        if(t1==t2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr1={15,8,2,37,49,117};
        int[] arr2={9,6,7,12,48,4,6,90,5};
        System.out.println(arr(arr1, arr2));

    }

    
}
