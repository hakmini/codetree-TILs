import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        int Long = len1;
        int Short = len1;

        // 가장 긴 문자열 길이 찾기
        if(Long < len2) Long = len2;
        if(Long < len3) Long = len3;

        // 가장 짧은 문자열 길이 찾기
        if(Short > len2) Short = len2;
        if(Short > len3) Short = len3;

        System.out.print(Long - Short);
    }
}
