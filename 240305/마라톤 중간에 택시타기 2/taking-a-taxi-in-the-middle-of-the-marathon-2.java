import java.util.*;
import java.io.*;
public class Main {
    static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> listX = new ArrayList<>();
        List<Integer> listY = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            listX.add(x);
            listY.add(y);
        }
        int Mindis = INT_MAX;
        //1번, n번 빼고 한 번씩 스킵할 반복문1.
        for(int i = 1; i < n - 1; i++) {
            int sum = 0;
            int prevIdx = 0;
            for(int j = 1; j < n; j++) {
            //1번과 n번 빼고 스킵
            if(i == j) continue;
            int disX = Math.abs(listX.get(prevIdx) - listX.get(j));
            int disY = Math.abs(listY.get(prevIdx) - listY.get(j));
            sum += disX + disY;
            prevIdx = j;
            }
            if(Mindis > sum) Mindis = sum;
        }
        System.out.print(Mindis);
    }
}