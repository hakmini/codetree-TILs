import java.util.Scanner;

public class Main {
    public static int min(int a, int b, int c) {
        int n = a;

        if (b < n) n = b;
        if (c < n) n = c;

        return n;
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int minmin = min(a,b,c);
        System.out.print(minmin);
    }
}