import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        String p1 = sc.next();
        int age2 = sc.nextInt();
        String p2 = sc.next(); 
        if((p1.equals("M") && age1 >= 19) || (p2.equals("M") && age2 >= 19)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
