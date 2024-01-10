import java.util.*;
import java.io.*;

class Distance {
    int dis;
    int num;

    public Distance(int dis, int num) {
        this.dis = dis;
        this.num = num;
    }
}
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Distance[] distances = new Distance[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int dis = Math.abs(x) + Math.abs(y); 
            distances[i] = new Distance(dis, (i+1));
        }

        Arrays.sort(distances, new Comparator<Distance>() {
            @Override
            public int compare(Distance a, Distance b) {
                if(a.dis == b.dis)
                return a.num - b.num;

                return a.dis - b.dis;
            }
        });

        for(int i = 0; i < n; i++) {
            System.out.println(distances[i].num);
        }
    }
}