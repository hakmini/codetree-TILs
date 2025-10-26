import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // 첫 번째 'e'의 위치 찾기
        int index = str.indexOf('e');

        // 'e'가 존재하면 제거
        if (index != -1) {
            str = str.substring(0, index) + str.substring(index + 1);
        }

        System.out.println(str);
    }
}