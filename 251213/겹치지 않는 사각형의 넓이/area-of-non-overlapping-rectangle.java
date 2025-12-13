import java.util.*;

public class Main {
    static final int SIZE = 2000;
    static final int OFFSET = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ax1 = sc.nextInt() + OFFSET;
        int ay1 = sc.nextInt() + OFFSET;
        int ax2 = sc.nextInt() + OFFSET;
        int ay2 = sc.nextInt() + OFFSET;

        int bx1 = sc.nextInt() + OFFSET;
        int by1 = sc.nextInt() + OFFSET;
        int bx2 = sc.nextInt() + OFFSET;
        int by2 = sc.nextInt() + OFFSET;

        int mx1 = sc.nextInt() + OFFSET;
        int my1 = sc.nextInt() + OFFSET;
        int mx2 = sc.nextInt() + OFFSET;
        int my2 = sc.nextInt() + OFFSET;

        int[][] checked = new int[SIZE + 1][SIZE + 1];

        // A 칠하기
        for (int x = ax1; x < ax2; x++) {
            for (int y = ay1; y < ay2; y++) {
                checked[x][y] = 1;
            }
        }

        // B 칠하기
        for (int x = bx1; x < bx2; x++) {
            for (int y = by1; y < by2; y++) {
                checked[x][y] = 1;
            }
        }

        // M으로 덮기 (지우기)
        for (int x = mx1; x < mx2; x++) {
            for (int y = my1; y < my2; y++) {
                checked[x][y] = 0;
            }
        }

        // 넓이 계산
        int area = 0;
        for (int x = 0; x <= SIZE; x++) {
            for (int y = 0; y <= SIZE; y++) {
                if (checked[x][y] == 1) area++;
            }
        }

        System.out.print(area);
    }
}
