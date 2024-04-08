import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n - 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n - 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int fir = arr[0] - 1;
        for(int i = 1; i < 1000; i++) {
            //첫 번째 arr[0] = i라고 가정하기
            if(i > arr[0]) continue;

            int[] arr2 = new int[n];
            arr2[0] = i;
            int next = arr[0] - i;
            boolean Check = true;
            for(int j = 1; j < n - 1; j++) {
                int temp = next;
                arr2[j] = temp;
                next = arr[j] - temp;
                if(temp == next || next == 0 || next > n) {
                    Check = false;
                    break;
                }
                if(next > n) Check = false;
            }

            boolean Real = false;
            if(Check) {
                arr2[n - 1] = next;
                for(int a = 0; a < n; a++)
                System.out.print(arr2[a] + " ");
                break;
            }
        }
    }
}