import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[4][4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum1 = 0;
        for(int i = 0; i < 4; i++){
            sum1 += arr[i][0];
        }

        int sum2 = 0;
        for(int i = 1; i < 4; i++){
            sum2 += arr[i][1];
        }

        int sum3 = 0;
        for(int i = 2; i < 4; i++){
            sum3 += arr[i][2];
        }

        System.out.print(sum1+sum2+sum3+arr[3][3]);



    }
}
