import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 1) {
            a += 3;
        }

        // a가 3의 배수라면 3으로 나누기
        if (a % 3 == 0) {
            a /= 3;
        }
         System.out.println(a);





        
    }
}
