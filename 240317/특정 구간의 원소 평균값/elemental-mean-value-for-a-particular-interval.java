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
            arr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                double avg = 0;
                for(int k = i; k <= j; k++) {
                    avg += arr[k];//평균 구하는 반복문1
                }
                avg = (double)avg/(j - i + 1);
                for(int k = i; k <= j; k++) {//평균이 그 구간 원소 중 하나가 되는지 확인하는 반복문2.
                    if(avg == arr[k]) {
                        cnt++;
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}