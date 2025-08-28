import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[b]; // 나머지는 0 ~ b-1 범위

        while(a > 1){
            int r = a % b; // 나머지
            arr[r]++;      // 카운트
            a = a / b;     // 몫을 다시 a에 저장
        }

        int sum = 0;
        for(int i = 0; i < b; i++){
            sum += arr[i] * arr[i]; // 등장횟수 제곱의 합
        }

        System.out.println(sum);
    }
}

