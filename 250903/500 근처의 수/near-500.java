import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int arr_down[] = new int[10];
        int arr_up[] = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 500){
                arr_down[i] = arr[i];
            }

            if(arr[i] > 500){
                arr_up[i] = arr[i];
            }
        }

        int down_max = arr_down[0];
        int up_min = 1000;

        for(int i = 1; i < 10; i++){
            if(arr_down[i] != 0 && down_max < arr_down[i]){
                down_max = arr_down[i];
            }
            if(arr_up[i] != 0 && up_min > arr_up[i]){
                up_min = arr_up[i];
            }
        }

        System.out.print(down_max + " " + up_min);

    }
}
