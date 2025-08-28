import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[10];
        int count = 0;
        int f = 0;


        /*for(int i = 0; i < 100; i++){

            if(a % b == i){
                count = i;
                a = a/b;
            }
            arr[count]++;
        }*/
        
        while(a>0){
            int r = a%b;
            arr[r]++;
            a = a/b;
        }



        int sum = 0;
        for(int i = 0; i < b; i++){
            sum += arr[i] * arr[i]; // 등장횟수 제곱의 합
        }

        System.out.println(sum);
    }
}
