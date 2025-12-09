import java.util.*;
class Student implements Comparable<Student>{
    String names;
    int korean;
    int english;
    int math;  

    public Student(String names, int korean, int english, int math){
        this.names = names;
        this.korean = korean;
        this.english = english;
        this.math = math;  
    }
    @Override
    public int compareTo(Student student){
        if(this.korean == student.korean){
            if(this.english == student.english){
                return student.math - this.math;
            }else{
                return student.english - this.english;                
            }
        } 
        return student.korean - this.korean;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String names = sc.next();
            int korean = sc.nextInt();
            int english = sc.nextInt();
            int math = sc.nextInt();

            students[i] = new Student(names, korean, english, math);
        }
        Arrays.sort(students);

        for(int i = 0; i < n; i++){
            System.out.println(students[i].names + " " + students[i].korean + " " + students[i].english + " " + students[i].math + " " );
        }
        
    }
}