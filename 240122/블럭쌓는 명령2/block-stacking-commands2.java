import java.util.*;
import java.io.*;

public class Main {
    static int max = 0;
    public static int Findmax(int[] arr, int n){
    for(int i = 1; i <= n; i++) {
        if(arr[i] > max)
        max = arr[i];
    }
    return max;
}
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];

        for(int i = 0; i < n+1; i++){
            arr[i] = 0;
        }

        for(int i = 0; i < k; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            for(int j = a; j <= b; j++) {
                arr[j] += 1;
            }
        }
        Findmax(arr, n);
        System.out.print(max);
    }
}