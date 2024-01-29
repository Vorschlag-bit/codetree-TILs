import java.util.*;
import java.io.*;
public class Main {
    public static int weiss = 0;
    public static int dunkel = 0;
    public static int grau = 0;
    public static int start = 100000;

    public static void Findout(int x, String dir, int[] arr) {
        if(dir.equals("R")){
            for(int i = start; i < start + x; i++) {
                arr[i]++;
                if(arr[i] > 4)
                continue;
                if(arr[i] == 4) {
                    grau++;
                    weiss--;
                    continue;
                }
                if(arr[i] > 1){
                    dunkel++;
                    weiss--;
                    continue;
                }
                dunkel++;
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
                     dunkel--;
                    continue;
                }
                if(arr[i] > 1){
                    weiss++;
                    dunkel--;
                    continue;
                }
                weiss++;
            }
                start -= (x - 1);
        }
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[200001];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();

            Findout(x, dir, arr);
        }
        System.out.printf("%d %d %d", weiss, dunkel, grau);
    }
}