import java.util.*;
public class Main {
    public static void Dothemath(int m, int[] arr){
        int sum = 0;
        while(m>=1){
            sum += arr[m-1];
            if(m%2==0)
            m /= 2;
            else
            m -= 1;
        }
        System.out.print(sum);
        return;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Dothemath(m, arr);
    }
}