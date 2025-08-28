import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < q; i++) {
            String type = sc.next(); // 쿼리 종류는 문자열로 받음

            if(type.equals("1")) {
                int a = sc.nextInt();
                System.out.println(arr[a-1]); // a번째 원소 → 인덱스는 a-1
            }
            else if(type.equals("2")) {
                int b = sc.nextInt();
                int index = -1;

                for(int j = 0; j < n; j++) {
                    if(arr[j] == b) {
                        index = j + 1; // 몇 번째 원소인지 (1부터 시작)
                        break;
                    }
                }

                if(index == -1) System.out.println(0);
                else System.out.println(index);
            }
            else if(type.equals("3")) {
                int s = sc.nextInt();
                int e = sc.nextInt();
                for(int j = s-1; j < e; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}
