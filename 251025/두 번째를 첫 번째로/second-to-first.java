import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();   


        char first = str.charAt(0);   
        char second = str.charAt(1);  

        String result = str.replace(second, first);

        System.out.println(result);
    }
}