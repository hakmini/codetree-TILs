import java.util.Scanner;
public class Main {
    public static int F(int mul){
        if(mul < 10) return mul;
        return F(mul / 10) + (mul % 10);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int mul = a*b*c;      
        System.out.print(F(mul));  
    }
}