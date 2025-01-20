import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int age = sc.nextInt();

        if(s == 0){
            if(age >= 19){
                System.out.println("MAN");
            }else if(age < 19){
                System.out.println("BOY");
            }
        }

        if(s == 1){
            if(age >= 19){
                System.out.println("WOMAN");
            }else if(age < 19){
                System.out.println("GIRL");
            }
        }       
    }
}
