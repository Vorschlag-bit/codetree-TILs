import java.util.*;
public class Main {
    public static int Max = 0;
    public static int max(int n, int[] arr) {
        if(n==0){
            if(arr[0] > Max)
            Max = arr[0];
            return Max;
        }

        if(arr[n - 1] > Max){
            Max = arr[n - 1];
        }
        return max(n-1, arr);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(max(n, arr));
    }
}