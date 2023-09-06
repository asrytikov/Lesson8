package p1;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Sergey", 23);
            person.info();
            Person p = person.clone();
            p.setName("Nick");
            person.info();
        }catch (CloneNotSupportedException exception){
            System.out.println("Clonable not supported");
        }
    }
}