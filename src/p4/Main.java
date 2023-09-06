package p4;

public class Main {

    public static void main(String[] args) {
        try {
            int[] numbers = new int[3];
            numbers[4] = 45;
            numbers[4] = Integer.parseInt("hsdgfhjsdg");
            System.out.println(numbers[4]);
        }catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Index Out");
        }catch (NumberFormatException ex){
            System.out.println("Error: string->int");
        }
        /*}finally {
            System.out.println("Final");
        }*/

    }

}
