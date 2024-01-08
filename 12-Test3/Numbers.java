public class Numbers implements Ok{
    private int[] my_array;
    public Numbers(int[] my_array){
        this.my_array=my_array;
    }
    public int[] getMy_array() {
        return my_array;
    }
    public boolean ok(){
        for(int i=0;i<my_array.length;i++){
            if((i%2==0&&my_array[i]%2==0)||(i%2!=0&&my_array[i]%2!=0)){
                continue;
            }else{
                return false;
            }
        }return true;

    }
    public static void main(String[] args) {
        int[] arr1={6,1,6,1,6};
        int[] arr2={2,5,2,8,4};
        Numbers n=new Numbers(arr1);
        Numbers m=new Numbers(arr2);
        System.out.println(n.ok());
        System.out.println(m.ok());
    }

}