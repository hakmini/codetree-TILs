import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];
        int temp;
        char state;
        int count = 0;

        for(int i = 0; i < 3; i++){
            state = sc.next().charAt(0);
            temp = sc.nextInt();

            if(state == 'Y' && temp >= 37){
                count = 1;
            }else if(temp >= 37){
                count = 2;
            }else if(state == 'Y'){
                count = 3;
            }else{
                count = 4;
            }
            arr[count]++;
        }

        for(int i = 1; i <= 4; i++) {
            System.out.print(arr[i] + " ");
        }
        
        if(arr[1] >= 2)
            System.out.println("E");

    }
}
