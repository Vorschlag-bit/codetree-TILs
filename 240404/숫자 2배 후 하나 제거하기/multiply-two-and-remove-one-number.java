import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++)
        arr[i] = Integer.parseInt(st.nextToken());

        int Mindiff = 100;
        for(int i = 0; i < n; i++) {
            arr[i] *= 2;
            
            for(int j = 0; j < n; j++) {
                int[] newarr = new int[n - 1];
                int cnt = 0;
                for(int k = 0; k < n; k++) {
                    if(k != j) 
                    newarr[cnt++] = arr[k];
                }

                int diff = 0;
                for(int k = 0; k < n - 2; k++) {
                    diff += Math.abs(newarr[k] - newarr[k + 1]);
                }
                Mindiff = Math.min(diff, Mindiff);
            }
            arr[i] /= 2;
        }
        System.out.print(Mindiff);
    }
}