import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        final int INT_MAX = Integer.MAX_VALUE;
        int cnt = 0;
        int min = INT_MAX;

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
            if(min>=arr[i]){
                min = arr[i];
            }
        }
        for(int i = 0; i<n; i++){
            if(min == arr[i])
            cnt++;
        }
        System.out.print(min+" "+cnt);
    }
}