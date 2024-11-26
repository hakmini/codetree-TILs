import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // 키 입력 (cm)
        int w = sc.nextInt(); // 몸무게 입력 (kg)
        
        // 체질량지수 계산
        double b = (10000.0 * w) / (h * h);
        
        // 소수점 첫째 자리에서 버림한 정수 계산
        int bmi = (int) Math.floor(b);
        
        // 첫 줄에 체질량지수 출력
        System.out.println(bmi);
        
        // 비만일 경우 "Obesity" 출력
        if (bmi >= 25) {
            System.out.println("Obesity");
        }
    }
}
