import java.util.*;
public class Main {
    public static final int N = 3;
    public static final int MAX_R = 200;
    public static final int OFFSET = 100;

    public static int[] x = new int[N];
    public static int[] y = new int[N];

    public static int[][] checked = new int[MAX_R + 1][MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt() + OFFSET;
            y[i] = sc.nextInt() + OFFSET;

        }

        for(int i = 0; i < N; i++){
            for(int a = x[i]; a < x[i] + 8; a++){
                for(int b = y[i]; b < y[i] + 8; b++){
                    checked[a][b]++;
                }
            }
        }
        int area = 0;
        for(int i = 0; i <= MAX_R; i++){
            for(int z = 0; z <= MAX_R; z++){
                if(checked[i][z] >= 1) area++;
            }
        }

        System.out.print(area);
    }
}