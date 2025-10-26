import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        // 첫 번째 삭제
        int a = sc.nextInt();
        if (a >= 0 && a < str.length()) {
            str = str.substring(0, a) + str.substring(a + 1);
        }
        System.out.println(str);

        // 두 번째 삭제
        int b = sc.nextInt();
        if (b >= 0 && b < str.length()) {
            str = str.substring(0, b) + str.substring(b + 1);
        }
        System.out.println(str);

        // 세 번째 삭제
        int c = sc.nextInt();
        if (c >= 0 && c < str.length()) {
            str = str.substring(0, c) + str.substring(c + 1);
        }
        System.out.println(str);

        // 네 번째 삭제
        int d = sc.nextInt();
        if (d >= 0 && d < str.length()) {
            str = str.substring(0, d) + str.substring(d + 1);
        } else {
            // d가 범위를 벗어나면 첫 문자만 남기기
            str = str.substring(0, 1);
        }
        System.out.println(str);
    }
}
