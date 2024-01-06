
public  class Isogram {
    
    
        
        
        public static boolean isogram(String s){
            String p=s.replaceAll(" ", "");
            char[] arr=p.toCharArray();
            

        
            for(int i=0;i<arr.length;i++){
                int total=0;
                for(int j=i+1;j<arr.length-1;j++){
                    if(arr[i]==arr[j]){
                        total++;
                    }
                }if(total>0){
                    return false;
                }
            }
            return true;
        }
        
    }
    


