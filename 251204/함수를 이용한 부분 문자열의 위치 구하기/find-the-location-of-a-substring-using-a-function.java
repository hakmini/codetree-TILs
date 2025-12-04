import java.util.Scanner;

public class Main {

    public static boolean isSame(String s, String t, int start){
        for(int i = 0; i < t.length(); i++){
            if(s.charAt(start + i) != t.charAt(i))
                return false;
        }
        return true;
    }

    public static int findIndex(String s, String t){
        for(int i = 0; i <= s.length() - t.length(); i++){
            if(isSame(s, t, i)){
                return i;   // 부분 문자열의 시작 인덱스
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();

        System.out.println(findIndex(S, T));
    }
}
