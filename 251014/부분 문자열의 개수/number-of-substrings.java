import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String part_str = sc.next();
        int count = 0;

        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i,i+2).equals(part_str)){
                count++;
            }
        }

        System.out.print(count);

    }
}
