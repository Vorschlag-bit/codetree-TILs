import java.util.*;
public class Main {
    public static int Min(int a, int b, int c){

        int min = Integer.min(a,b);
        int rm = Integer.min(min, c);

        return rm;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println(Min(n1,n2,n3));

        
    }
}