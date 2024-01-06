public class Logic {
    private boolean[] array;
    public Logic(boolean[] array){
        this.array=array;
    }
    public boolean[] getArray() {
        return array;
    }
    public int opposite(){
        int total=0;
        for(int i=0;i<array.length;i++){
            if(i!=0&&i!=array.length-1){
                if(array[i-1]==array[i+1]){
                    total++;

                }
            }
        }
        return total;

    }
    public static void main(String[] args) {
        boolean[] arr1 = {true,false,false};
        boolean[] arr2 = {true,false,true,false};
        boolean[] arr3 = {true,false,true,true,false,true,false,true,false};
        Logic logic=new Logic(arr1);
        Logic logic2=new Logic(arr2);
        Logic logic3=new Logic(arr3);
        System.out.println(logic.opposite());
        System.out.println(logic2.opposite());
        System.out.println(logic3.opposite());


        
    }
    



    
}
