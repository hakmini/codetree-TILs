import java.util.Scanner;

public class Main {

    public static void MaxS(int n, int m) {
        int gcd = 1; // 최대공약수 저장용 변수

        for(int i = 1; i <= Math.min(n, m); i++) {
            if(n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }

    System.out.printf("%d", gcd);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
       
        MaxS(n, m);
    }
}