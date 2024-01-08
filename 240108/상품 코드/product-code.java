import java.util.*;
class Merchandise {
    String name;
    int code;

    public Merchandise() {
        this.name = "";
        this.code = 0;
    }

    public Merchandise(String name, int code) {
        this.name = name;
        this.code = code;
    }
};
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        Merchandise mer2 = new Merchandise(s, n);
        Merchandise mer1 = new Merchandise();
        mer1.name = "codetree";
        mer1.code = 50;


        System.out.println("product " + mer1.code + " is " + mer1.name);
        System.out.println("product " + mer2.code + " is " + mer2.name);
    }
}