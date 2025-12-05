import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        
        int sum = 0;
        
        if(m % 2 == 0){
            for(int a = m; a >= 1; a /= 2){
                sum += arr[a];
            }
        }else{
            for(int a = m; a >= 1; a--){
                sum += arr[a];
            }
        }

        System.out.print(sum);


    }
}