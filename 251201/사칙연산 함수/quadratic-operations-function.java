import java.util.Scanner;
public class Main {

    public static int plu(int a, int c){
        return a + c;
    }

    public static int min(int a, int c){
        return a - c;        
    }

    public static int div(int a, int c){
        return (int) a / c;        
    }

    public static int mul(int a, int c){
        return a * c;        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        int result = 0;

        if(o == '+'){
            result = plu(a, c);
            System.out.print(a+" + "+c+" = "+result);
        } else if(o == '-'){
            result = min(a, c);
            System.out.print(a+" - "+c+" = "+result);
        } else if(o == '*'){
            result = mul(a, c);
            System.out.print(a+" * "+c+" = "+result);
        } else if(o == '/'){
            result = div(a, c);
            System.out.print(a+" / "+c+" = "+result);
        } else {
            System.out.println("False");
            return;  // 프로그램 종료
        }
    }
}