import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int arr[] = new int[s.length()];
        int num = 0;

        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i) - '0';
        }

        for(int i = 0; i < arr.length; i++){
            num = num*2 + arr[i];
        }
        System.out.print(num);

        // Please write your code here.
    }
}