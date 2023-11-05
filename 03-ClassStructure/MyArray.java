import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArray {

    
    public static int even(int[] array){
        int total=0;
        for(int i:array){
            if(i%2==0){
                total+=1;
            }
        }
        return total;

    }
    public static int positiveOdd(int[] array){
        int total=0;
        for(int i:array){
            if(i%2!=0 && i>=0){
                total+=1;

            }
        }
        return total;
    }
    public static int[] reverse(int[] array){
        int[] temp=new int[array.length];
        int n=array.length;
        
        for(int i=0;i<array.length;i++){
            temp[n-1]=array[i];
            n=n-1;

        }
        return temp;
        

    }
    public static boolean compared(int[] array1,int[] array2){
        if(Arrays.compare(array1, array2)==1){
            return true;
        }else{
            return false;
        }

        
    }
    public static boolean compare(int[] array1,int[] array2){
        if(array1.length==array2.length){
            for(int i=0;i<array1.length;i++){
                if(array1[i]==array2[i]){
                    continue;

                }else{
                    return false;
            
                }}
            return true;
            }
        
        return false;
        }
    
    public static String different(int[] array1,int[] array2){
        List<String> arrayOfStrings = new ArrayList<>();
        
        for(int a:array1){
            int i=0;
            for(int b:array2){
                if(a!=b){
                    i+=1;
                    
                }
            }
            if(i==array2.length){
                if(!arrayOfStrings.contains(Integer.toString(a)))
                
                arrayOfStrings.add(Integer.toString(a));
            
            }
        
        }
        String joined=String.join(",",arrayOfStrings);
        
        return joined;
    } 
    public static boolean exist(int number,int[] array){
        for(int n:array){
            if(n==number){
                return true;
                
                
          
            }
            
        }
        return false;

    }
    public static int secondMax(int[] array){
       
        int max=array[0];
        for(int i:array){
            if(i>max){
                max=i;
            }

        }
        int secondmax=array[0];

        if(secondmax==max){
            secondmax=array[1];
        }
        for(int j:array){
            if(j!=max){
                if(j>secondmax){
                    secondmax=j;
                }
            }else{
                continue;
            }
        }
        return secondmax;

       
    }
    public static int lastColumn(int[][] array){
        int total=0;
        int lastColumn=array.length-1;
        for(int i:array[lastColumn]){
            total+=i;


        }
        return total;

    }
    public static int[][] swap(int[][] array){
        
        for(int i=0;i<array.length;i++){
            int temp=array[i][0];
            array[i][0]=array[i][array[i].length-1];
            array[i][array[i].length-1]=temp;

            

        }
        return array;
        
    }
    public static List<Integer> oneDArray(int[][] array) {
    List<Integer> oneDimensionalArray = new ArrayList<>();
    for (int row = 0; row < array.length; row++) {
	for (int col = 0; col < array[row].length; col++)
	    oneDimensionalArray.add(array[row][col]);
    }
    return oneDimensionalArray;
}
    public static void main(String[] args) {
        int[] arr={2,3,4,5,67,34,8,-4,-8,-3,-3,-3,-10,2,2,34,33,34,125};
        System.out.println(even(arr));
        System.out.println(positiveOdd(arr));
        int[] arr2={2,3,4,56};
        int[] arr3={2,3,4,5,67,8,-4,-8,-3,-3,-3,-10,2,2};
        int[] arr4={2,3,4,5,67,66,8,-4,-8,-3,-3,-3,-10,2};
        int[][] arr5={{2,3,4},{3,4,6},{1,2}};
        System.out.println(compare(arr, arr3));
        System.out.println(compare(arr,arr4));
        System.out.println(compare(arr,arr2));
        System.out.println(different(arr, arr3));
        System.out.println(different(arr,arr2));
        System.out.println(exist(2, arr2));
        System.out.println(secondMax(arr4));
        System.out.println(lastColumn(arr5));
       
        
        System.out.println(Arrays.toString(reverse(arr4)));
        for(int[] row:swap(arr5)){
            System.out.println(Arrays.toString(row));

        }
        System.out.println(oneDArray(arr5));
        
    }
}
