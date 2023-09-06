package p2;

public class Book implements Cloneable{

    private String name;
    private Author author;

    public Book(String name, String author) {
        this.name = name;
        this.author = new Author(author);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author.getName();
    }

    public void setAuthor(String author) {
        this.author.setName(author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                '}';
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        Book newBook =  (Book)super.clone();
        newBook.author = (Author) author.clone();
        return newBook;
    }
}
