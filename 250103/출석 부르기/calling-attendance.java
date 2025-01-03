import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int at = sc.nextInt();
        if(at == 1){
            System.out.println("John");
        }else if(at == 2){
            System.out.println("Tom");
        }else if(at == 3){
            System.out.println("Paul");
            
        }else{
            System.out.println("Vacancy");
        }
    }
}