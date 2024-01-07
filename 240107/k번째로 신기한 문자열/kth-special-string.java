import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        String t = sc.next();

        int len = t.length();
        int cnt = 0;
        int cnt1 = 0;

        String[] arr = new String[n];
        String[] arr1 = new String[n];

        for(int i = 0; i < n; i++){   
            arr[i] = sc.next();
        }
        Arrays.sort(arr);

        for(int i = 0; i < n; i++){
            cnt = 0;
            for(int j = 0; j < len; j++){
                if(t.charAt(j) == arr[i].charAt(j)){
                cnt++;
                }
            }
            if(cnt == len){
                arr1[cnt1] = arr[i];
                cnt1++;
            }
        }
        System.out.print(arr1[k-1]);
    }
}