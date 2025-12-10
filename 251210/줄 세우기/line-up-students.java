import java.util.*;

class Student implements Comparable<Student>{
    int height;
    int weight;
    int num;

    public Student(int height, int weight, int num){
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    @Override
    public int compareTo(Student student){
        if(this.height == student.height){
            if(this.weight == student.weight){
                return this.num - student.num;
            }
            return student.weight - this.weight;
        }
        return student.height - this.height;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();

            students[i] = new Student(height, weight, i+1);

        }
        Arrays.sort(students);


        for (int i = 0; i < n; i++){
            System.out.print(students[i].height + " ");
            System.out.print(students[i].weight + " ");
            System.out.println(students[i].num);

    }
 }
}