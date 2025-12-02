import java.util.Scanner;

public class Main {

    public static boolean isDay(int m, int d) {
        // 월 범위 체크
        if (m > 12)
            return false;

        // 월별 일수
        int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        // 일 범위 체크
        if (d > days[m])
            return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        if(isDay(m, d))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
