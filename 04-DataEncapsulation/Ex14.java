public class Ex14 {
    public class MyString{
        private String s;

        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }
        public int calculateNumber(String s){
            
            return s.length();
        }
        public String display9(String s){
            return getS().substring(0,9);

        }
        public boolean checkEnd(String s){
            if(getS().endsWith("day!")){
                return true;
            }else{
                return false;
            }
            
        }
        public boolean checkIfEmpty(String s){
            if(!getS().equals("")){
                return true;
            }else{
                return false;
            }
            
        }
        public int lastE(String s){
            int index=getS().lastIndexOf("e");
            return index;
        }
        public String replace(String s){
            return getS().replace(" ", "-");

        }
        public String toUpper(String s){
            return getS().toUpperCase();
        }

    }
    
}
