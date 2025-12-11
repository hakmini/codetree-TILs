import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  

        ArrayList<Integer> v = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String cmd = sc.next();   

            if(cmd.equals("push_back")){
                int x = sc.nextInt();
                v.add(x);
            }

            else if(cmd.equals("pop_back")){
                v.remove(v.size() - 1);
            }

            else if(cmd.equals("size")){
                System.out.println(v.size());
            }

            else if(cmd.equals("get")){
                int k = sc.nextInt();
                System.out.println(v.get(k - 1));
            }
        }
    }
}
