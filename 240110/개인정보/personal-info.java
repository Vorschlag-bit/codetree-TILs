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
        return person.height - this.height;
    }
}
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Person[] persons = new Person[5];

        for(int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            persons[i] = new Person(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(persons);

        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public String compare(Person a, Person b) {
                return a.name.compareTo(b.name);
            }
        });

        System.out.println("name");
        for(int i = 0; i < 5; i++) {
            System.out.println(persons[i].name+" "+persons[i].height+" "+persons[i].weight);
        }
        System.out.println("height");
        for(int i = 0; i < 5; i++) {
            System.out.println(persons[i].name+" "+persons[i].height+" "+persons[i].weight);
        }
    }
}