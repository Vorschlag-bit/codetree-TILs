import java.util.*;
import java.io.*;
public class Main {
    static int weiss = 0;
    static int dunkel = 0;
    static int grau = 0;
    static int start = 100000;
    static char[] directions = new char[200001]; //검은색, 흰색을 저장할 배열.
    public static void Findout(int x, String dir, int[] arr) {
        if(dir.equals("R")){
            for(int i = start; i < start + x; i++) {
                arr[i]++;
                if(arr[i] > 4)
                continue;
                if(arr[i] == 4) {
                    grau++;
                    directions[i] = 'g';
                    continue;
                }
                directions[i] = 'b';
            }
            start += (x - 1);
        }
        else{
            for(int i = start; i > start - x; i--) {
                arr[i]++;
                if(arr[i] > 4)
                continue;
                else if(arr[i] == 4) {
                     grau++;
                     directions[i] = 'g';
                    continue;
                }
                directions[i] = 'w';
            }
                start -= (x - 1);
        }
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[200001];//각 타일이 총 몇 번 칠해지는 표시할 배열.

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();

            Findout(x, dir, arr);
        }
        for(int i=0; i<directions.length; i++){
            if (directions[i] == 'w')
                weiss++;
            else if(directions[i] == 'b')
                dunkel++;
        }
        System.out.printf("%d %d %d", weiss, dunkel, grau);
    }
}