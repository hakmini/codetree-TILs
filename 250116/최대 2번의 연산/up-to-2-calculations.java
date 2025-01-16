import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = 0;

        if(a % 2 == 0){
            s = a / 2;
        }
        if(s % 2 != 0){
            System.out.println((s + 1)/2);
        }

        if(a % 2 != 0){
            System.out.println((a + 1)/2);
        }

      






    }
}