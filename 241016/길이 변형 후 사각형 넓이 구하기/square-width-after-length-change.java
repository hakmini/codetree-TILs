import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //가로
        int b = sc.nextInt(); //세로
        int wid = a*b;

        a += 8;
        System.out.println(a);

        b *= 3;
        System.out.println(b);

        System.out.println(a*b);
    }
}