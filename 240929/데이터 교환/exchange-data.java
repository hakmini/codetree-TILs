public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5;
        int b = 6;
        int c = 7;
        
        int temp;
        int temp2;
        int temp3;

        temp = a;
        a = b;
        b = temp;

        temp2 = b;
        b = c;
        c = temp2;

        temp3 = c;
        c = a;
        a = temp3;

        System.out.println(temp);
        System.out.println(temp2);
        System.out.println(temp3);

    }
}