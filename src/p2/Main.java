package p2;

public class Main {

    public static void main(String[] args) {
        try{
            Book book = new Book("War and Peace", "Tolstoy");
            Book book2 = book.clone();
            book2.setAuthor("Turgenev");
            System.out.println(book.getAuthor());
        }catch (CloneNotSupportedException exception){
            System.out.println("Not clone");
        }
    }

}
