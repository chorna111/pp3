public class Person{
    private String name;
    private String surname;
    public Person(String name,String surname){
        this.name=name;
        this.surname=surname;

    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String toString(){
        return String.format("%s%s",name.charAt(0),surname.charAt(0)).toUpperCase();
    }
    public static void main(String[] args) {
        Person p=new Person("anna","may");
        System.out.println(p);
    }


}