import java.util.*;
import java.util.Arrays;
import java.io.*;

class Person implements Comparable<Person> {
    String name;
    int height, weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person) {
        return (person.height - this.height)&&(this.name - person.name);
    }
}
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferReader br = new BufferReader(new InputStreamReader(System.in));

        Person[] persons = new Person[5];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            persons[i] = new Person(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(persons);

        System.out.println(name);
        for(int i = 0; i < n; i++) {
            System.out.println(persons[i].name+" "+persons[i].height+" "+persons[i].weight);
        }
    }
}