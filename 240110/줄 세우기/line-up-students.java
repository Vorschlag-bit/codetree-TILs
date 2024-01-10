import java.util.*;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int height;
    int weight;
    int number;

    public Student(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student student) {
        if(this.height == student.height)
        if(this.weight == student.weight)
        return this.number - student.number;
        else  return student.weight - this.weight;

        return student.height - this.height;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            int number = (i+1);

            students[i] = new Student(height, weight, number);
        }

        Arrays.sort(students);

        for(int i = 0; i < n; i++) {
            System.out.println(students[i].height+" "+students[i].weight+" "+students[i].number);
        }
    }
}