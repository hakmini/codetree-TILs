import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        String AB = "";
        String BA = "";

        AB = A + B;
        BA = B + A;

        if(AB.equals(BA)){
            System.out.print("true");
        }else{
            System.out.print("false");            
        }

    }
}
