import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int[] arr = new int[binary.length()];
        int[] arr2 = new int[20];
        int num = 0;
        int cnt = 0;

        for(int i = 0; i < binary.length(); i++){
            arr[i] = binary.charAt(i) - '0';
        }

        for(int i = 0; i < arr.length; i++){
            num = num * 2 + arr[i];
        }

        int num2 = num * 17;
        while(true){
            if(num2 < 2){
                arr2[cnt++] = num2;
                break;
            }
            arr2[cnt++] = num2 % 2;
            num2 /= 2;
        }

        for(int i = cnt - 1; i >= 0; i--){
            System.out.print(arr2[i]);
        }


        
    }
}