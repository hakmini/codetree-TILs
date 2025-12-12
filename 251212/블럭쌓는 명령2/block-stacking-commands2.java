import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
  

        int[] arr = new int[N];
        int max = arr[0];
        for(int i = 0; i < K; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            for(int a = A; a <= B; a++){
                arr[i]++;
            }
        }

        for(int i = 0; i < N; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.print(max);

        

    }
}