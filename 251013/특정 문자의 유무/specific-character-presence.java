import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLen = str.length();
        boolean exist_ee = false;
        boolean exist_ab = false;

        for(int i = 0; i < strLen - 1; i++){
            if(str.substring(i, i+2).equals("ee")){
                exist_ee = true;
            }
        }

        for(int i = 0; i < strLen - 1; i++){
            if(str.substring(i, i+2).equals("ab")){
                exist_ab = true;
            }
        }

        if(exist_ee == true){
            System.out.print("Yes"+" ");
        }else{
            System.out.print("No"+" ");            
        }

        if(exist_ab == true){
            System.out.print("Yes"+" ");
        }else{
            System.out.print("No"+" ");            
        }

    }
}
