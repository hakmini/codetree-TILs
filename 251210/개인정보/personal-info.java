import java.util.*;

class Student implements Comparable<Student> {
    String names;
    int heights;
    double weights;

    public Student(String names, int heights, double weights){
        this.names = names;
        this.heights = heights;
        this.weights = weights;
    }

    @Override
    public int compareTo(Student other) {
        return this.names.compareTo(other.names);  // 이름 기준 오름차순
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5]; 

        for (int i = 0; i < 5; i++) {
            String names = sc.next();
            int heights = sc.nextInt();
            double weights = sc.nextDouble();

            students[i] = new Student(names, heights, weights);
        }

        Arrays.sort(students);   // 이름순 정렬

        System.out.println("name");
        for(int i = 0; i < 5; i++){
            System.out.printf("%s %d %.1f\n",
                students[i].names,
                students[i].heights,
                students[i].weights
            );
        }

        System.out.println();
        Arrays.sort(students, (a, b) -> b.heights - a.heights);
        System.out.println("height");
        for(int i = 0; i < 5; i++){
            System.out.printf("%s %d %.1f\n",
                students[i].names,
                students[i].heights,
                students[i].weights
            );
        }

    }
}
