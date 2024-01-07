import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[2*n];
        int Min = 0;

        for(int i = 0; i < 2*n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0; i< 2*n; i++){
            if(arr[i] != arr[2*n-1-i]){
                if(arr[i] + arr[2*n-1-i] > Min)
                Min = arr[i] + arr[2*n -1 -i];
            }
        }
        System.out.print(Min);
    }
}