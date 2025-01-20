import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int y = 2025;
        int n = sc.nextInt();
        if(y % 4 != 0){
            if(n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12){
                System.out.println("31");
            }else if(n == 4 || n == 6 || n == 9 || n == 11){
                System.out.println("30");
            }else if(n == 2){
                System.out.println("28");
            }
        }
       
    }
}


// 윤년 : 4로 나누어 떨어지는 해
// 윤년이 아닌 해의 2월은 28일// 윤년 : 4로 나누어 떨어지는 해
// 윤년이 아닌 해의 2월은 28일 
// 31 28 31 30 31 30 31 31 30 31 30 31
// 1  2  3  4  5  6  7  8  9  10 11 12