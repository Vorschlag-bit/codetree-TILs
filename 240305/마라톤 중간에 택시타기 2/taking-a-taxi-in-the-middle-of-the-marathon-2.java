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
            int CurrX = listX.get(i);
            int Curry = listY.get(i);
            listX.remove(i);
            listY.remove(i);
            for(int j = 0; j < n - 2; j++) {
            //1번과 n번 빼고 스킵
            int disX = Math.abs(listX.get(j) - listX.get(j + 1));
            int disY = Math.abs(listY.get(j) - listY.get(j + 1));
            sum += disX + disY;
            }
            if(Mindis > sum) Mindis = sum;
            listX.add(i, CurrX);
            listY.add(i, Curry);
        }
        System.out.print(Mindis);
    }
}