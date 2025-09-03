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

        for(int i = 0; i < idx2; i++){
            if(arr[i] >= max3){
                System.out.print(i+1);
            } 
        }
        

        


    

    }
}
