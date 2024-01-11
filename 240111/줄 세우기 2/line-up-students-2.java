import java.util.*;
import java.io.*;
import java.util.Arrays;

class Student {
    int height, weight, number;

    public Student(int height, int weight, int number) {
        this. height = height;
        this. weight = weight;
        this.number = number;
    }
}
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            students[i] = new Student(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), (i+1));
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if(a.height == b.height)
                return b.weight - a.weight;

                return a.height - b.height;
            }
        });

        for(int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\n", students[i].height, students[i].weight, students[i].number);
        }
    }
}