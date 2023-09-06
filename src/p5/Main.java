package p5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            if (x>50) throw new Exception("ERROR: X>50");
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

}
