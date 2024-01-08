import java.util.*;
public class Main {
    static class Secret {
        String code;
        char place;
        int time;

        public Secret(String code, char place, int time) {
        this.code = code;
        this.place = place;
        this.time =time;
    }
    };
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char l = sc.next().charAt(0);
        int n = sc.nextInt();

        Secret secret = new Secret(s, l, n);

        System.out.println("secret code : "+secret.code);
        System.out.println("meeting point : "+secret.place);
        System.out.println("time : "+secret.time);
    }
}