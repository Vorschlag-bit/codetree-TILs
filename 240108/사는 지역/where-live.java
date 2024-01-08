import java.util.*;

class Person implements Comparable<Person> {
    String name;
    String address;
    String region;

    public Person(String name, String address, String region) {
        this.name = name;
        this.address = address;
        this.region = region;
    }

    @Override
    public int compareTo(Person other) {
        return other.name.compareTo(this.name); // 이름을 기준으로 내림차순으로 정렬
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String address = sc.next();
            String region = sc.next();
            Person person = new Person(name, address, region);
            people.add(person);
        }

        // 사전순으로 정렬
        Collections.sort(people);

        // 결과 출력
        Person lastPerson = people.get(0);
        System.out.println("name " + lastPerson.name);
        System.out.println("addr " + lastPerson.address);
        System.out.println("city " + lastPerson.region);
    }
}