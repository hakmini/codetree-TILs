import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 999 || arr[i] == -999){
                break;
            }
        }


        int maxVal = arr[0];
        int minVal = arr[0];

        // 주어진 숫자들 중 최댓값과 최솟값을 구합니다.
        for (int i = 1; i < 100; i++) {
            if (arr[i] == 999 || arr[i] == -999)
                break;

            if (arr[i] > maxVal)
                maxVal = arr[i];

            if (arr[i] < minVal)
                minVal = arr[i];
        }
        System.out.print(maxVal + " " + minVal);


    }
}
