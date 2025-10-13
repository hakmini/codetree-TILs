import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String strstr = "";
        for(int i = 0; i < n; i++){
            String str = sc.next();
            strstr += str;
        }


        System.out.print(strstr);
    }
}

