import java.util.*;
import java.util.Arrays;
public class Main {
    public static int cnt = 1;
    public static int Middle(int[] arr, int i){
        Arrays.sort(arr, 1, cnt);
        if(i==1)
        return arr[1];
        
        return arr[(1+i)/2];
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n+1];

        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            cnt++;
            if(i%2==1)
            System.out.print(Middle(arr, i)+" ");
        }
    }
}