import java.util.*;
import java.io.*;

public class Main {
    static int n, c, g, h;

    static int getMaxper(int temp, Equipment[] arr) {
        int Curtemp = 0;
        for (int i = 0; i < n; i++) {
            if (temp < arr[i].Ta)
                Curtemp +=  c;
            else if (temp >= arr[i].Ta && temp <= arr[i].Tb)
                Curtemp += g;
            else if (temp > arr[i].Tb)
                Curtemp += h;
        }
        return Curtemp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        g = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        Equipment[] arr = new Equipment[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i] = new Equipment(Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()));
        }
        int ans = 0;
        for (int i = 0; i < 1001; i++) {
            ans = Math.max(ans, getMaxper(i, arr));
        }
        System.out.println(ans);
    }
}

class Equipment {
    public int Ta;
    public int Tb;

    // 생성자의 이름은 클래스 이름과 동일하게 해야하며 반환 유형을 지정하지 않습니다.
    public Equipment(int Ta, int Tb) {
        this.Ta = Ta;
        this.Tb = Tb;
    }
}