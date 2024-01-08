import java.util.*;
class Bomb {
    String code;
    char color;
    int second;
    
    public Bomb(String code, char color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char l = sc.next().charAt(0);
        int n = sc.nextInt();

        Bomb bomb = new Bomb(s, l, n);

        System.out.println("code : " + bomb.code);
        System.out.println("color : " + bomb.color);
        System.out.println("second : " + bomb.second);
    }
}