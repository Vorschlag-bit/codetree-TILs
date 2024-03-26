import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] person = new int[d];
        int[] ch = new int[d];
        int[] time = new int[d];
        int[] sick = new int[s];
        int[] sickt = new int[s];

        for(int i = 0; i < d; i ++) {
            st = new StringTokenizer(br.readLine());

            person[i] = Integer.parseInt(st.nextToken());
            ch[i] = Integer.parseInt(st.nextToken());
            time[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < s; i++) {
            st = new StringTokenizer(br.readLine());

            sick[i] = Integer.parseInt(st.nextToken());
            sickt[i] = Integer.parseInt(st.nextToken());
        }
        
        int ans = 0;
        for(int i = 0; i < s; i++) {
            //병의 기록을 보고 상한 치즈 후보군를 찾는 반복문.
            int sickperson = sick[i];
            int paintime = sickt[i];
            int cheez = 0;
            for(int j = 0; j < d; j++) {
                if(sickperson == person[j] && time[j] < paintime)
                cheez = ch[j];
                int med = 0;
                //상한 치즈인지 확인하는 반복문.
                for(int k = 0; k < d; k++) {
                    if(cheez == ch[k])
                    med++;
                }
                ans = Math.max(med, ans);
            }
        }
        System.out.println(ans);
    }
}