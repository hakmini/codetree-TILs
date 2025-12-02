import java.util.Scanner;
class mainPro{
    int value;
    public mainPro(int value){
        this.value = value;
    }
}

public class Main {
    public static void modify(mainPro n , mainPro m){
        if(n.value > m.value){
            n.value = n.value + 25;
            m.value = m.value * 2;
        }else{
            m.value = m.value + 25;
            n.value = n.value * 2;            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        mainPro n = new mainPro(a);
        mainPro m = new mainPro(b);

        modify(n,m);

        System.out.print(n.value + " " + m.value);

    }
}