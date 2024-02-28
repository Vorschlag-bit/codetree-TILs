import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int dx = 0;
        int dy = 0;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String dir = st.nextToken();
            int dis = Integer.parseInt(st.nextToken());

            if(dir.equals("E")) {
                dx = dx + dis;
            }
            else if(dir.equals("W")) {
                dx = dx - dis;
            }
            else if(dir.equals("N")) {
                dy = dy + dis;
            }
            else dy = dy - dis;
        }

        System.out.print(dx+" "+dy);
    }
}