import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();



        // 큰 숫자를 처리하기 위해 BigDecimal 사용
        BigDecimal num = new BigDecimal(a);
        BigDecimal denom = new BigDecimal(b);
        BigDecimal result = num.divide(denom, 20, RoundingMode.FLOOR); // 20자리까지 계산 후 내림

        System.out.println(result);
    }
}
