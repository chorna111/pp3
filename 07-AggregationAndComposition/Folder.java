
import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<File> listOfFiles;
    private File file;
  
    private int numberOfFiles;
    
    public Folder(String name){
        this.name=name;
       
        
        listOfFiles=new ArrayList<File>();
     
    }
    
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumberOfFiles(){
        numberOfFiles=listOfFiles.size();
    }
    public int getNumberOfFiles(){
        return numberOfFiles;
    }
    
     
    public ArrayList<File> getListOfFiles() {
        return listOfFiles;
    }
    public void setListOfFiles(ArrayList<File> listOfFiles) {
        this.listOfFiles = listOfFiles;
    }
    
    public void addFile(String name,String content){
        File file=new File();
        file.setName(name); 
        file.setContent(content);
        
             
        listOfFiles.add((file));

    }
    public void removeFile(String name){
        for(File f:listOfFiles){
            if(f.getName()==name){
                listOfFiles.remove(f);
                break;
            }
        }

    }
   
    
    
    public String toString(){
        ArrayList<String> arr=new ArrayList<String>();
        for(File f:listOfFiles){
            String s=f.getName();
            arr.add(s);

        }
        
        return "Folder content: "+arr;
    }
    public static void main(String[] args) {
        Folder myFolder=new Folder("pp3");
        
        myFolder.addFile("Ex1.java","Class Ex1");
        myFolder.addFile("Ex2.java","Class Ex2");
        System.out.println(myFolder);
        myFolder.removeFile("Ex2.java");

        System.out.println(myFolder);
        
        
    }
}

    

        
    
    
    



  
    

