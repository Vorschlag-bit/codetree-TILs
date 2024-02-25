import java.util.*;
import java.io.*;
import java.util.Arrays;

//악수의 정보를 나타내는 클래스 선언
class Shake implements Comparable<Shake> {
    int time;
    int infected;
    int infect;

    public Shake(int time, int infected, int infect) {
        this.time = time;
        this.infected = infected;
        this.infect = infect;
    }

    @Override
    public int compareTo(Shake obj) {
        // 시간을 기준으로 오름차순으로 정렬.
        return time - obj.time;

    }
};

public class Main {
    public static int[] shakeNum = new int[251];
    public static boolean[] inf = new boolean[251];

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        inf[p] = true;
        //Shake 인스턴스를 담아둘 배열 생성.
        Shake[] shakes = new Shake[250];

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            //Shake 객체를 생성해서 배열에 담기.
            shakes[i] = new Shake(t, x, y);
        }

        //custom comparator를 활용한 정렬
        Arrays.sort(shakes, 0, T);

        //각 악수 횟수를 세고, k번 초과 시 전염 x
        for(int i  = 0; i < T; i++) {
            //x개발자
            int target1 = shakes[i].infected;
            //y개발자
            int target2 = shakes[i].infect;

            //감염되어 있는 경우 악수 횟수 증가
            if(inf[target1])
            shakeNum[target1]++;
            if(inf[target2])
            shakeNum[target2]++;

            //target1이 감염되어 있고 아직 k번 이하 악수라면 target2 전염
            if(shakeNum[target1] <= k&& inf[target1])
            inf[target2] = true;

            //target2가 감염되어 있고 아직 k번 이하로 악수라면 target1 전염
            if(shakeNum[target2] <= k&& inf[target2])
            inf[target1] = true;
        }

        for(int i = 1; i <= n; i++) {
            if(inf[i])
            System.out.print(1);
            else
            System.out.print(0);
        }
    }
}