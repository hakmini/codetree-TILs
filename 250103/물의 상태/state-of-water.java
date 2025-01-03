import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int tem = sc.nextInt();
        if(tem < 0){
            System.out.println("ice");
        }
        else if(tem >= 100){
            System.out.println("vapor");
        }
        else{
            System.out.println("water");
        }

    }
}