import java.util.*;
import java.io.*;
public class Main {
    static int Max = 100000;

    static int[] arr = new int[2 * Max + 1];
    static int[] Bp = new int[2 * Max + 1];
    static int[] Wp = new int[2 * Max + 1];
    static int b, w, g;

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int start = Max;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            char s = st.nextToken().charAt(0);

            if(s == 'L') {
                //  x칸 왼쪽으로 이동.
                while(x-- > 0) {
                    arr[start] = 1;
                    Wp[start]++;
                    if(x > 0) start--;
                }
            }
            else {
                //x칸 오른쪽으로 이동.
                while(x-- > 0) {
                    arr[start] = 2;
                    Bp[start]++;
                    if(x > 0) start++;
                }
            }
        }

        for(int i = 0; i < 2 * Max; i++) {
            if(Bp[i] >=2&& Wp[i] >= 2) g++;

            else if(arr[i] == 1) w++;
            else if(arr[i] == 2) b++;
        }

        System.out.printf("%d %d %d", w, b, g);
    }
}