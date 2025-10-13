import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();


        String encoded = "";


        char currChar = A.charAt(0);
        int numChar = 1;
        for(int i = 1; i < A.length(); i++){
            if(A.charAt(i) == currChar){

                numChar++;
            }
            else {

                encoded += currChar;
                encoded += Integer.toString(numChar);

                currChar = A.charAt(i);
                numChar = 1;
            }
        }

        encoded += currChar;
        encoded += Integer.toString(numChar);

        System.out.println(encoded.length());
        System.out.println(encoded);
    }
}