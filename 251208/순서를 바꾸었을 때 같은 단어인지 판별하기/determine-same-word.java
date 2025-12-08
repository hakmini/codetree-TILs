import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static boolean F(char[] char1, char[] char2){
        if(char1.length != char2.length) return false;

        int n = char1.length;
        for(int i = 0; i < n; i++){
            if(char1[i] != char2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        

        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();       

        Arrays.sort(char1);
        Arrays.sort(char2);
        
        if(F(char1,char2)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
    }
}