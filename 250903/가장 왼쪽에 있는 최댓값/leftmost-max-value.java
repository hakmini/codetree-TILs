import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int max2 = arr[0];
        int max3 = arr[0];
        int idx = 0;
        int idx2 = 0;
        int idx3 = 0; 

        for(int i = 1; i < n; i++){
            if(arr[i] > max){   
                max = arr[i];
                idx = i;
            }
        }

        for(int i = 1; i < idx; i++){
            if(arr[i] > max2){   
                max2 = arr[i];
                idx2 = i;
            }
            
        }

        System.out.print(idx+1 + " " + (idx2+1) + " ");

        int end = idx2; // 이제 idx2의 왼쪽 구간을 탐색 시작
        while (end > 0) {
            int maxNow = arr[0];
            int idxNow = 0;

            for (int i = 1; i < end; i++) {
                if (arr[i] > maxNow) {
                    maxNow = arr[i];
                    idxNow = i;
                }
            }

            System.out.print((idxNow+1));

            if (idxNow == 0) break; // 첫 번째 원소 도달 시 종료
            end = idxNow; // 그 왼쪽 구간으로 탐색 범위 축소
        }
        

        


    

    }
}
