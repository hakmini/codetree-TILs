import java.util.*;
class Game{
    String id;
    int level;

    public Game(String id, int level){
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        
        Game codetree = new Game("codetree", 10);
        Game user = new Game(id, level);

        System.out.println("user " + codetree.id + " lv " + codetree.level);
        System.out.println("user " + user.id + " lv " + user.level);        
    }
}