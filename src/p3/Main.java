package p3;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Nick", 34);
        System.out.println(person.toString());

        Person1 person1 = new Person1("Ivan","Ivanov", 111);
        Person1 person11 = new Person1("Ivan", 44);
        System.out.println(person1.toString());
        System.out.println(person1.name());
        System.out.println(person1.age());
        System.out.println(person1.hashCode());
        System.out.println(person1.equals(person11));

    }

}

record Person1(String name, int age){

    static int minAge;
    static{
        minAge = 18;
        System.out.println("Stat init");
    }

    Person1(String firstName, String lastName, int age){

        this(firstName +" "+lastName, age);
        /*if (age<1 || age>110){
            age = 18;
        }

        this.name = name;
        this.age = age;*/
    }

    public String name(){
        return "Gospodin "+name;
    }
    public String toString(){
        return String.format("Person %s, Age: %d", name, age);
    }

}
