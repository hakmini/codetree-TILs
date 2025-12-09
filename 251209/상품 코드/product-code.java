import java.util.Scanner;
class Food{
    String id2;
    int code2;
    public Food(String id2, int code2){
        this.id2 = id2;
        this.code2 = code2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        
        Food food1 = new Food("codetree", 50);
        Food food2 = new Food(id2,code2);
        
        System.out.println("product " + food1.code2 + " is " + food1.id2);
        System.out.println("product " + food2.code2 + " is " + food2.id2);
    }
}