import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
class Student {
    String name;
    int kor;
    int eng;
    int math;

    public Student (String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

    }
};
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] students = new Student[n];
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            students[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(students, new Comparator<Student> () {
            @Override
            public int compare(Student a, Student b) {
                if(a.kor != b.kor) 
                return b.kor - a.kor;
                else if(a.eng != b.eng)
                return b.eng - a.eng;
                
                return b.math - a.math;
            } 
        });

        for(int i = 0; i < n; i++) {
            System.out.print(students[i].name + " ");
            System.out.print(students[i].kor + " ");
            System.out.print(students[i].eng + " ");
            System.out.println(students[i].math + " ");
        }
    }
}