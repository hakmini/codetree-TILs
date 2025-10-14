import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int count_ee = 0;
        int count_eb = 0;


        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i+2).equals("ee")){
                count_ee++;
            }
            if(str.substring(i, i+2).equals("eb")){
                count_eb++;
            }
        }

        System.out.print(count_ee + " ");
        System.out.print(count_eb); 

    }
}
