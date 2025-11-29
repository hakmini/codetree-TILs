import java.util.Scanner;
public class Main {
    public static boolean sumFive(int a){
        boolean i = false;
        int b = a / 10;
        int c = a % 10;
        int d =  b + c;
        
        if(a % 2 == 0 && d % 5 == 0){
            return i = true;
        }else{
            return i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean result = sumFive(n);
        if(result == true){
            System.out.print("Yes");
        }else{
            System.out.print("No");            
        }

    }
}