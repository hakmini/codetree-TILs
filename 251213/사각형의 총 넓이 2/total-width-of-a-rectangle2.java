import java.util.*;

public class Main {
    static final int OFFSET = 100;
    static final int SIZE = 200;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[][] board = new boolean[SIZE][SIZE];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            // 사각형 칠하기 (끝점 제외)
            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    board[x][y] = true;
                }
            }
        }

        int area = 0;
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                if (board[x][y]) area++;
            }
        }

        System.out.print(area);
    }
}
