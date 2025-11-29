import java.util.Scanner;

public class Main {

    // 1) 3의 배수인가?
    public static boolean three(int n) {
        return n % 3 == 0;
    }

    // 2) 일의 자리가 3, 6, 9인가?
    public static boolean tsn(int n) {
        int last = n % 10;
        return last == 3 || last == 6 || last == 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int count = 0;

        for(int i = A; i <= B; i++){
            if (three(i) || tsn(i)) {  
                count++;
            }
        }

        System.out.println(count);
    }
}
