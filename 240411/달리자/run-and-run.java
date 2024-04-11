import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        int[] b = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
        a[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
        b[i] = Integer.parseInt(st.nextToken());

        int ans = 0;
        //입력으로 주어진 사람 수를 보고
        //최소 어느 만큼의 거리를 달려야 하는지 확인합니다.
        for(int i = 0; i < n; i++) {    
            if(a[i] > b[i]) {
                //최소 a[i] - b[i]만큼의 사람들은 오른쪽으로 가야함.
                int gap = a[i] - b[i];
                a[i] -= gap;
                a[i + 1] += gap;
                ans += gap;
            }    
        }
        System.out.print(ans);
    }
}