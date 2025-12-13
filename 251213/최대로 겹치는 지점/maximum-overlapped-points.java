import java.util.*;
public class Main {
    public static final int MAX_N = 100;
    public static final int MAX_R = 100;

    public static int[] start = new int[MAX_N];
    public static int[] end = new int[MAX_N];
    
    public static int[] checked = new int[MAX_R+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }


        for(int i = 0; i < n; i++){
            for(int a = start[i]; a <= end[i]; a++){
                checked[a]++;
            }
        }
        int count = 0;
        for(int i = 0; i <= MAX_R; i++){
            if(checked[i] > count){
                count = checked[i];
            }
        }

        System.out.print(count);
        
    }
}