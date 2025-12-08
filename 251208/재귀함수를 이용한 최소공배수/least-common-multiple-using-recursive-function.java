import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static int lcmArray(int[] arr, int idx) {
        if (idx == arr.length - 1)
            return arr[idx];

        return lcm(arr[idx], lcmArray(arr, idx + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(lcmArray(arr, 0));
    }
}
