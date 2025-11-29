import java.util.Scanner;

public class Main {
    public static int min(int z, int y, int x){
        int n = 0;
        for(int i = 0; i < 3; i++){
            if(z >= y){
                n = y;
            }else if(y >= z){
                n = z;
            }


        }
        return n;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int minmin = min(a,b,c);
        System.out.print(minmin);
    }
}