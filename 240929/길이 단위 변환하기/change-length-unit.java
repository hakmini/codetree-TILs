public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        double ft1 = 9.2;
        double mi1 = 1.3;
        
        double ft = ft1 * 30.48;
        double mi = mi1 * 160934;
        
        System.out.printf("9.2ft" + " = " + "%.1f"+"cm", ft);
        System.out.println();
        System.out.printf("1.3mi" + " = " + "%.1f"+"cm", mi);

    }
}