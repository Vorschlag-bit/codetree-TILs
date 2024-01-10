import java.util.*;
import java.io.*;
import java.util.Arrays;

class Student {
    int height, weight;
    String name;

    public Student(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            students[i] = new Student(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if(a.height==b.height)
                return b.weight - a.weight;

                return a.height - b.height;
            }
        });

        for(int i = 0; i < n; i++) {
            System.out.print(students[i].name);
            System.out.printf(" %d %d\n", students[i].height, students[i].weight);
        }
    }
}