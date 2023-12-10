package mock;
import java.util.ArrayList;

public class Family {
    private Person p;

    private ArrayList<Person> group;


    public Family(Person p){
        this.p=p;
        ArrayList<Person> group=new ArrayList<Person>();
        this.group=group;
        group.add(p);



    }
    
    public Person getP() {
        return p;
    }

    public int adults(){
        int total=0;
        for(Person person:group){
            if(person.getAge()>=18){
                total++;
            }
        }
        return total;
    }

    
}
