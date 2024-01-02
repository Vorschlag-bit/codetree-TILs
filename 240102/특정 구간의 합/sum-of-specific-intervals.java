import java.util.*;
public class Main {
    public static int[] A = new int[101];

    public static void Printsome(int a1, int a2){
        int sum = 0;
        for(int i = a1-1; i <= a2-1; i++){
            sum += A[i];
        }
        System.out.println(sum);
        return;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            Printsome(a1, a2);
        }
    }
}