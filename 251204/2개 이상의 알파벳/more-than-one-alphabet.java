import java.util.Scanner;
public class Main {
    public static boolean check(String a){
        for(int i = 0; i < a.length() - 1; i++){
            if(a.charAt(i) != a.charAt(i+1)){
                return true;

            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        if(check(A)){
            System.out.print("Yes");
        }else{
            System.out.print("No");            
        }

    }
}