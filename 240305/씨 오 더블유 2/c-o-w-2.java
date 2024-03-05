import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] arr = new char[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();

        for(int i = 0; i < n; i++) {
            arr[i] = str.charAt(i);
        }

        int start1 = 0, start2 = 0, cnt = 0;

        for(int i = 0; i < n; i++) {
            //C를 찾을 반복문
            if(arr[i] == 'C') start1 = i;
            else continue;
            for(int j = start1 + 1; j < n; j++) {
                //O를 찾을 반복문
                if(arr[j] == 'O') start2 = j;
                else continue;
                for(int k = start2 + 1; k < n; k++) {
                    if(arr[k] == 'W') cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}