package p2;

public class Author implements Cloneable{

    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Author clone() throws CloneNotSupportedException {
        return (Author) super.clone();
    }
}
