import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char ch = sc.next().charAt(0);
        int a = -1;

        if(a != str.indexOf(ch)){
            System.out.print(str.indexOf(ch));
        }else{
            System.out.print("No");            
        }

        

    }
}
