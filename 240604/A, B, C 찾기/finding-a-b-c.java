import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[7];

        int sum = 0;

        for(int i = 0; i < 7; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        // a + b + c 구하기
        sum /= 4;

        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[1];
        int c = sum - (a + b);

        System.out.println(a + " " + b + " " + c);
    }
}