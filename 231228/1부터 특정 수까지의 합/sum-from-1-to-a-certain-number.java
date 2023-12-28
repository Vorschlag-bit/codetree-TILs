import java.util.*;
public class Main {
    public static int extra(int n){
        int total = 0;
        for(int i = 1; i<=n; i++){
            total += i;
        }
        return total;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = extra(num);

        System.out.println(sum/10);
    }
}