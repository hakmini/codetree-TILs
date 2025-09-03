import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int arr_down[] = new int[10];
        int arr_up[] = new int[10];
        int upCount = 0;
        int downCount = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 500){
                arr_down[downCount++] = arr[i];
            }

            if(arr[i] > 500){
                arr_up[upCount++] = arr[i];
            }
        }

        int down_max = arr_down[0]; // 500보다 작은 수 중 최대
        int up_min = arr_up[0]; // 500보다 큰 수 중 최소

        for(int i = 0; i < 10; i++){
            if(down_max < arr_down[i]){
                down_max = arr_down[i];
            }
            if(arr_up[i] != 0 && up_min > arr_up[i]){
                up_min = arr_up[i];
            }
        }

        System.out.print(down_max + " " + up_min);
    }
}
