import java.util.Scanner;
public class Main {

    public static void printOneNine(int n){
        int z = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%d ", z);
                z++;
                if(z > 9) z = 1;
            }
            System.out.println();


        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOneNine(n);
    }
}