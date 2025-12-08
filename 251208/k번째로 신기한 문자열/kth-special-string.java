import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        String t = sc.next();  // 접두사 문자열 T

        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        // T로 시작하는 단어만 리스트에 담기
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (words[i].startsWith(t)) {
                list.add(words[i]);
            }
        }

        // 사전순 정렬
        Collections.sort(list);

        // K번째 출력
        System.out.println(list.get(k - 1));
    }
}
