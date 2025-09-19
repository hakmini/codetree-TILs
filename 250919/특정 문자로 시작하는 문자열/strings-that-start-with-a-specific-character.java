import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String arr[] = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }

        char c = sc.next().charAt(0);

        int num = 0;
        int sum = 0;

        for(int i = 0; i < n; i++){
            if(arr[i].charAt(0) == c){
                sum += arr[i].length();
                num++;
            }
        }

        double avg = (double) sum / num;

        System.out.print(num + " ");
        System.out.printf("%.2f", avg);
    }
}
