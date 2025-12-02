import java.util.Scanner;
public class Main {

    public static boolean isYoon(int y){
        if(y % 4 == 0 && y % 100 != 0){
            return true;
        }
        return false;
    }

    public static boolean isYYoon(int y, int m, int d){
        if(isYoon(y)){
            if(m > 12){
                return false;
            }else{
                int days[] = {0,31,29,31,30,31,30,31,31,30,31,30,31};
                if(d > days[m]){
                    return false;
                }else return true;
            }
        }else{
            if(m > 12){
                return false;
            }else{
                int dayss[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
                if(d > dayss[m]){
                    return false;
                }else return true;
            }            

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if(isYYoon(y,m,d)){
            if(m >= 3 && m <= 5){
                System.out.print("Spring");
            }else if(m >= 6 && m <= 8){
                System.out.print("Summer");
            }else if(m >= 9 && m <= 11){
                System.out.print("Fall");
            }else{
                System.out.print("Winter");
            }
        }else{
            System.out.print("-1");
        }
    }
}