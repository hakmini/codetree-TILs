import java.util.*;

class codeTree{
    String sCode;
    char mPoint;
    int time;

    public codeTree(String sCode, char mPoint, int time){
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();

        codeTree codetree = new codeTree(sCode,mPoint,time);
        System.out.println("secret code : " + codetree.sCode);
        System.out.println("meeting point : " + codetree.mPoint);
        System.out.println("time : " + codetree.time);        
    }
}