import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = Integer.toString(n);

        int sum = 0;

        for(int i = 0; i<s.length(); i++){
            String str = Character.toString(s.charAt(i));
            int num = Integer.parseInt(str);
            sum += num;
        }

        System.out.println(sum);
    }
}