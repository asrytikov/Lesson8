public class Person implements Cloneable{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void info(){
        System.out.printf("Person name: %s \n", name);
    }

    public Person clone() throws CloneNotSupportedException{
        return (Person) super.clone();
    }
}
