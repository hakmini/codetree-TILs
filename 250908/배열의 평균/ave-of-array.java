import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[2][4];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 2; i++){
            int sum = 0;
            for(int j = 0; j < 4; j++){
                sum = sum + arr[i][j];
            }
            double avg_len = sum / 4.0;
            System.out.printf("%.1f ", avg_len);
        }

        System.out.println();




        for (int j = 0; j < 4; j++) {
            double avg_hei = (arr[0][j] + arr[1][j]) / 2.0;
            System.out.printf("%.1f ", avg_hei);
        }

        System.out.println();



        int sum = 0;

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                sum = sum + arr[i][j];
            }
        }

        double avg = sum / 8.0;
        System.out.printf("%.1f ", avg);

        





    }
}
