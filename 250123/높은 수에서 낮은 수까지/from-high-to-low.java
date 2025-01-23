import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a >= b){
            for(int i = a; a >= b; a--){
                System.out.print(a + " ");
            }
        }else if(b >= a){
            for(int  i = b; b >= a; b--){
                System.out.print(b + " ");
            }
        }

       
    }
}
