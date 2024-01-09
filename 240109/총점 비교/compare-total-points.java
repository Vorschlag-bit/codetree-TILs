import java.util.*;
import java.util.Arrays;

class Person implements Comparable<Person> {
    String name;
    int subject1;
    int subject2;
    int subject3;

    public Person(String name, int subject1, int subject2, int subject3) {
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    public int compareTo(Person person) {
        return ((this.subject1 + this.subject2 + this.subject3) - 
        (person.subject1 + person.subject2 + person.subject3));
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Person[] person = new Person[n];
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int subject1 = sc.nextInt();
            int subject2 = sc.nextInt();
            int subject3 = sc.nextInt();

            person[i] = new Person(name, subject1, subject2, subject3);
        }

        Arrays.sort(person);

        for(int i = 0; i < n; i++){
            System.out.println(person[i].name + " " + person[i].subject1 + " " + person[i].subject2 + " " + person[i].subject3);
        }
    }
}