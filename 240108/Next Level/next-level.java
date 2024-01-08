import java.util.*;
class Accoutant {
    int level;
    String id;

    public Accoutant (int level, String id) {
        this.level = level;
        this.id = id;
    }

    public Accoutant () {
        this.id = "codetree";
        this.level = 10;
    }
};
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        Accoutant Accoutant1 = new Accoutant();
    

        System.out.println("user " + Accoutant1.id + " lv " + Accoutant1.level);

        Accoutant1.id = s;
        Accoutant1.level = n;

        System.out.println("user " + Accoutant1.id + " lv " + Accoutant1.level);
    }
}