import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int score =  sc.nextInt();
        if(score >= 80){
            System.out.println("pass");
        }else{
            System.out.println(80-score + " more" + " score");
        }

    }
}