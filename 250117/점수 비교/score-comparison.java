import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int Am = sc.nextInt();
        int Ae = sc.nextInt();
        int Bm = sc.nextInt();
        int Be = sc.nextInt();

        if(Am > Bm && Ae > Be){
            System.out.println("1");
        }else{
            System.out.println("0");
        }




        
    }
}
