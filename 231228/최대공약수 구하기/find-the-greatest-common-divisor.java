import java.util.*;
public class Main {
    public static void com(int n, int m){
        int max = Integer.min(n,m);
        int g = 0;

        for(int i = 1; i<=max; i++){
            if(n%i==0&&m%i==0){
                g = i;
            }
        }

        System.out.println(g);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        com(a,b);
    }
}