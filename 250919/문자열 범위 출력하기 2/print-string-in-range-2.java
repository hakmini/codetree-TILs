import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] s = str.toCharArray();
    
        int n = sc.nextInt();

        n = Math.min(n, str.length());
        for(int i = str.length() - 1; i >= str.length() - n; i--){
            System.out.print(s[i]);
        }

    }
}




