import java.util.Scanner;

public class Main {

    public static int sumPrime(int a, int b){
        int sum = 0;

        for(int num = a; num <= b; num++){  // num: 검사 대상 숫자
            boolean isPrime = true;

            if(num == 1) continue; // 1은 소수 아님

            // 소수 판별
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }

            // 소수라면 합
            if(isPrime) sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(sumPrime(a, b));
    }
}
