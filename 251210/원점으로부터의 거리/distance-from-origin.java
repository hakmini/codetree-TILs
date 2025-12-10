import java.util.*;

class Meter {
    int index;      
    int distance;   

    public Meter(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt(); // x
            points[i][1] = sc.nextInt(); // y
        }


        Meter[] arr = new Meter[n];

        for (int i = 0; i < n; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int dist = Math.abs(x) + Math.abs(y);  

            arr[i] = new Meter(i + 1, dist); 
        }


        Arrays.sort(arr, (a, b) -> {
            if (a.distance != b.distance) {
                return a.distance - b.distance; 
            }
            return a.index - b.index; 
        });        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].index);
        }
    }
}
