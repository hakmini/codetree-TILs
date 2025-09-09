import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[][] arr2d = new int[100][100];
        int cnt = 1;
        

        int n = sc.nextInt();
        int m = sc.nextInt();
        

        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                arr2d[i][j] = cnt++;
        

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}