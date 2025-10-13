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


        for(int i = 0; i < strstr.length(); i += 5){
            for(int j = i; j < i + 5; j++){
                System.out.print(strstr.charAt(i));
                System.out.println();
                
            }
        }

    }
}

