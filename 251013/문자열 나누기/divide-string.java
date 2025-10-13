import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String strstr = "";

        for (int i = 0; i < n; i++) {
            strstr += sc.next();
        }

        // 5글자씩 출력
        for (int i = 0; i < strstr.length(); i += 5) {
            int end = Math.min(i + 5, strstr.length());
            System.out.println(strstr.substring(i, end));
        }
    }
}

