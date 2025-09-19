import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[10];

        // 문자열 10개 입력
        for(int i = 0; i < 10; i++){
            arr[i] = sc.next();
        }

        // 마지막에 문자 입력
        char s = sc.next().charAt(0);

        // 조건에 맞는 문자열 출력
        boolean found = false;
        for(int i = 0; i < 10; i++){
            if(arr[i].endsWith(String.valueOf(s))){
                System.out.println(arr[i]);
                found = true;
            }
        }

        // 끝나는 문자열이 없는 경우
        if(!found){
            System.out.println("None");
        }
    }
}
