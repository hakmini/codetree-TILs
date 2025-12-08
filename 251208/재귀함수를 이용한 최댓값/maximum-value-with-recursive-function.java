import java.util.Scanner;
public class Main {
    public static int maxNum = Integer.MIN_VALUE; 

    public static void findMaxRecursive(int[] arr, int i, int n) {
        if (i == n) return;

        if (maxNum < arr[i]) {
            maxNum = arr[i];
        }

        findMaxRecursive(arr, i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findMaxRecursive(arr, 0, n);

        System.out.println(maxNum);
    }
}
