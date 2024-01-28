import java.util.*;
import java.io.*;
public class Main {
    public static int max = 0;
    public static int Findmax(int[] arr) {
        for(int i = 0; i < 202; i++) {
            if(arr[i] > max)
            max = arr[i];
        }
        return max;
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[202];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int x1 = a + 100;
            int x2 = b + 100;

            for(int j = x1; j < x2; j++) {
                arr[j]++;
            }
        }

        Findmax(arr);
        System.out.print(max);
    }
}