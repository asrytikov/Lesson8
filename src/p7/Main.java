package p7;

public class Main {

    public static void main(String[] args) {

        //unchecked exception
        //ArithmeticException
        //IndexOutOfBoundsException
        //IllegalArgumentException
        //NullPointerException
        //NumberFormatException
        //checked exception
        //CloneNotSupportedException
        //InterruptedException
        //ClassNotFoundException

      /*  try{
            int x = 6/0;
        }catch (Exception exception){
            exception.printStackTrace();
        }*/

        try{
            int res = Factorial.getFactorial(-6);
            System.out.println(res);
        }catch (FactorialException exception){
            System.out.println(exception.getMessage());
            System.out.println(exception.getNumber());
        }

    }

}
