import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = st.nextToken().charAt(0) - 'A';
        }

        //1번째: 정렬 방향은 오른쪽으로 통일하되
        //자기 오른쪽에 위치한 원소와 비교하여 자리교환
        int ans = 0;
        for(int i = 0; i < n - 1; i++) {
            int time = 0;
            int idx = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[idx] > arr[j]) {
                    int temp = arr[idx];
                    arr[idx] = arr[idx + 1];
                    arr[idx + 1] = temp;
                    idx++;
                    ans++;
                }
            }
        }

        //2번째 정렬: 자기 왼쪽에 위치한 원소와 비교하여 자리교환
        for(int i = 1; i < n; i++) {
            int time = 0;
            int idx = i;
            for(int j = i; j >= 0; j--) {
                if(arr[j] > arr[idx]) {
                    int temp = arr[idx];
                    arr[idx] = arr[idx - 1];
                    arr[idx - 1] = temp;
                    idx--;
                    ans++;
                }
            }
        }
        System.out.print(ans);
    }
}