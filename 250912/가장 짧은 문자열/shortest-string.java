import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int Long = str1.length();
        int Short = str1.length();

        for(int i = 0; i < 3; i++){
            if(Long <= str2.length()){
                Long = str2.length();
            }
            if(str2.length() <= str3.length()){
                Long = str3.length();
            }
        
        }

        for(int i = 0; i < 3; i++){
            if(Short >= str2.length()){
                Short = str2.length();
            }
            if(str2.length() >= str3.length()){
                Short = str3.length();
            }
        }

        System.out.print(Long - Short);


    }
}
