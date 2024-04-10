import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
        arr[i] = Integer.parseInt(st.nextToken());

        int ans = Integer.MAX_VALUE;
        
        for(int i = 1; i <= 10000; i++) {
            //최댓값을 i라고 가정

            //Check: 구간을 나눌 수 있는지 판단하는 함수
            //part: 나눠져야 하는 구간 개수
            boolean Check = true;
            int part = 1;

            int sum = 0;
            for(int j = 0; j < n; j++) {
                //숫자 하나가 i보다 크면 나눌 수 없음.
                if(arr[j] > i) {
                    Check = false;
                    break;
                }

                //j번째 숫자가 들어갈 때 최댓값i보다 커지면 
                //j번째 숫자부터 다음 구간으로 만들기.
                if(sum + arr[j] > i) {
                    sum = 0;
                    part++;
                }

                sum += arr[j];
            }
            if(Check && part == m) {
                    ans = Math.min(ans, i);
            }
        }
        System.out.println(ans);
    }
}