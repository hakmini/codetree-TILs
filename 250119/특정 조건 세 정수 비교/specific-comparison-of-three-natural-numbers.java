import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //a가 최솟값일 때
        if(a <= b && a <= c){
            if(a == a){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");  
            }
        }else if(b <= a && b <= c){
            if(b == a){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");  
            }
        }else if(c <= b && c <= a){
            if(c == a){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");  
            }
        }

        if(a == c && a == b){
            System.out.print("1");
        }else{
            System.out.print("0");  
        }

    }
}
