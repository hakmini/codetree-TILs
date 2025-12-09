import java.util.*;
class Agent{
    String name;
    int score;
    public Agent(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agent[] agent = new Agent[5];

        for(int i = 0; i < 5; i++){
            String name = sc.next();
            int score = sc.nextInt();
            agent[i] = new Agent(name, score);
        }
        
        int min = Integer.MAX_VALUE;
        String minName = "";
        for(int i = 0; i < 5; i++){
            if(min > agent[i].score){
                min = agent[i].score;
                minName = agent[i].name;
            }
        }

        System.out.println(minName + " " + min);
    }
}