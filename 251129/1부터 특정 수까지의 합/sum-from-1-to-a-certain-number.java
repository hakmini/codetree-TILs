import java.util.Scanner;
public class Main {
    public static int sumAvg(int a){
        int sum = 0;
        for(int i = 1; i <= a; i++){
            sum = sum + i;
        }
        return sum/10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int avg = sumAvg(n);
        System.out.print(avg);
        
    }
}