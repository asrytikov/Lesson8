package p6;

public class Main {

    public static void main(String[] args) {
        try{
            int result = getSum(-5, 10);
            System.out.println(result);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }


   /* public static int getSum(int a, int b) throws Exception {
        if (a<0) throw new Exception("a<0");
        return a+b;
    }*/
   public static int getSum(int a, int b) {

       int res = 0;
       try {
           if (a < 0) throw new Exception("a<0");
           res = a + b;
       } catch (Exception exception) {
           System.out.println(exception.getMessage());
       }

    return res;

}
}