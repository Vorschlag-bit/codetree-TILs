import java.util.*;
import java.io.*;
public class Main {
    static int Max = 100000;
    static char[] Tail = new char[Max * 2 + 1];
    static int w, b;
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int start = Max;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);

            if(c == 'L') {
                while(x-- > 0) {
                    Tail[start] = 'w';
                    if(x > 0) start--;
                }
            }
            else {
                while(x-- > 0) {
                    Tail[start] = 'b';
                    if(x > 0) start++;
                }
            }
        }
        for(int i = 0; i < Max * 2 + 1; i++) {
                if(Tail[i] == 'w') w++;
                else if(Tail[i] == 'b') b++;
            }
            System.out.printf("%d %d", w, b);
    }
}