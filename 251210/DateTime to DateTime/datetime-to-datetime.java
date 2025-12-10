import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // day
        int B = sc.nextInt(); // hour
        int C = sc.nextInt(); // minute

        int startDay = 11;
        int startHour = 11;
        int startMin = 11;

        int start = startDay * 24 * 60 + startHour * 60 + startMin;
        int target = A * 24 * 60 + B * 60 + C;

        int diff = target - start;

        if (diff < 0)
            System.out.println(-1);
        else
            System.out.println(diff);
    }
}

