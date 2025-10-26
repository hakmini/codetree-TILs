import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len = str.length();

        int a = sc.nextInt();
        str = str.substring(0,a) + str.substring(a+1);
        System.out.println(str);

        int b = sc.nextInt();
        str = str.substring(0,b) + str.substring(b+1);
        System.out.println(str);

        int c = sc.nextInt();
        str = str.substring(0,c) + str.substring(c+1);
        System.out.println(str);

        int d = sc.nextInt();

        if(d > len){
            str = str.substring(0,1);
            System.out.println(str);
        }else{
            str = str.substring(0,d) + str.substring(d+1);    
            System.out.println(str);
        }
    }
}
