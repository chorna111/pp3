package mock;
import java.util.ArrayList;

public class Numbers {
    private ArrayList<Integer> list;
    
    
    public Numbers(int n1,int n2,int n3,int n4, int n5){
        ArrayList<Integer> list=new ArrayList<Integer>();
        this.list=list;
        this.list.add(n1);
        this.list.add(n2);
        this.list.add(n3);
        this.list.add(n4);
        this.list.add(n5);



    }

    public boolean different(){
        for(int i=0;i<list.size()-2;i++){
            
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    return false;

            }

            }
            

        }
        return true;

    }
    public static void main(String[] args) {
        Numbers num=new Numbers(9,1,4,3,7);
        System.out.println(num.different());
        Numbers n2=new Numbers(9, 4, 9,1, 6);
        System.out.println(n2.different());
    }
    
}
