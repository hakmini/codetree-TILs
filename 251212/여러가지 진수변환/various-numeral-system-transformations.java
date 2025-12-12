import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[20];
        int cnt = 0;

        if(b == 4){
            while(true){
                if(n < 4){
                    arr[cnt++] = n;
                    break;
                }
                arr[cnt++] = n % 4;
                n /= 4;
            }
        }else if(b == 8){
            while(true){
                if(n < 8){
                    arr[cnt++] = n;
                    break;
                }
                arr[cnt++] = n % 8;
                n /= 8;
        }
    }

    for(int i = cnt - 1; i >= 0; i--){
        System.out.print(arr[i]);
        }
    }
}