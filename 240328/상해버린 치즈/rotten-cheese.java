import java.util.*;
import java.io.*;
//치즈 먹방 기록
class Inf1 {
    int p, m, t;

    public Inf1(int p, int m, int t) {
        this.p = p;
        this.m = m;
        this.t = t;
    }
};
//병의 기록
class Inf2 {
    int p, t;

    public Inf2(int p, int t) {
        this.p = p;
        this.t = t;
    }
};
public class Main {
    static final int MAX_N = 50;
    static final int MAX_D = 1000;
    static int n, m, d, s;
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        Inf1[] inf1 = new Inf1[MAX_D];
        Inf2[] inf2 = new Inf2[MAX_N];

        for(int i = 0; i < d; i++) {
            st = new StringTokenizer(br.readLine());

            int p = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            inf1[i] = new Inf1(p, m, t);
        }

        for(int i = 0; i < s; i++) {
            st = new StringTokenizer(br.readLine());
            
            int p = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            inf2[i] = new Inf2(p, t);
        }

        int ans = 0;

        //하나의 치즈가 상했을 때 필요한 약의 최댓값 구하기.
        for(int i = 1; i <= m; i++) {
            //i번째 치즈가 상했을 때 필요한 약의 수 구하기.

            //i번째 치즈가 상했다고 가정할 때 모순이 발생하지 않는지 확인
            //time배열을 만들어 각 사람이 언제 치즈를 먹었는지 저장.
            int[] time = new int[MAX_N + 1];
            for(int j = 0; j < d; j++) {
                //i번째 치즈가 아닌 경우 패스
                if(inf1[j].m != i) continue;

                //person이 i번째 치즈를 처음 먹었거나 이전보다 빨리 먹은 경우 time배열 갱신
                int person = inf1[j].p;
                if(time[person] == 0)
                time[person] = inf1[j].t;
                else if(time[person] > inf1[j].t)
                time[person] = inf1[j].t;
            }

            boolean check = true; //i번째 치즈가 상했는지 판별할 함수

            for(int j = 0; j < s; j++) {
                //personㅣ i번째 치즈를 먹지 않았거나, i번째 치즈를 처음 먹은 시간보다 먼저 아플 경우 모순
                int person = inf2[j].p;
                if(time[person] == 0)
                check = false;
                if(time[person] >= inf2[j].t)
                check = false;
            }

            //만약 i번째 치즈가 상했을 가능성이 있다면 약 개수 확인.
            int med = 0;
            if(check) {
                for(int j = 1; j <= n; j++) {
                    if(time[j] != 0)
                    med++;
                }
            }
            ans = Math.max(ans, med);
        }
        System.out.print(ans);
    }
}