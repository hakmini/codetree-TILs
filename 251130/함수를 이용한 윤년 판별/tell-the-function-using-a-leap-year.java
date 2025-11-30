import java.util.Scanner;

public class Main {
    public static boolean yoon(int y){
        boolean isYoon = false;
        if(y % 4 == 0) isYoon = true;
        if(y % 100 == 0 && y % 400 != 0) isYoon = false;

        return isYoon;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        // Please write your code here.

        if(yoon(y) == true){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}