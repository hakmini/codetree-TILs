import java.util.Scanner;
public class Main {

    public static boolean isPrime(int n) {
    if (n < 2) return false;

    for(int i = 2; i < n; i++){
        if(n % i == 0) return false;
        }
        return true;
    }


    public static boolean jja (int n) {
        int one = n / 10;
        int two = n % 10;
        
        int sum = one + two;
        if(sum % 2 == 0){
            return true;
        }
        return false;

    }    


    public static int sosu(int a, int b){
        int count = 0;

        for(int i = a; i <= b; i++){
            if(isPrime(i) && jja(i)){   
            count++;      
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(sosu(a, b));


    }
}