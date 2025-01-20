import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int Am = sc.nextInt();
        int Ae = sc.nextInt();
        int Bm = sc.nextInt();
        int Be = sc.nextInt();       

        if(Am > Bm){
            System.out.println("A");
        }else{
            System.out.println("B");
        }

        if(Am == Bm){
            if(Ae > Be){
                System.out.println("A");
            }else{
                System.out.println("B");
            }
        }


    }
}

// 영어는 상관없이 수학점수가 높다면 출력
// 수학 점수가 같다면 영어점수로 출력하기