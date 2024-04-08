import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[15];

        for(int i = 0; i < 15; i++)
        arr[i] = Integer.parseInt(st.nextToken());

        for(int a = 1; a <= 40; a++)
        for(int b = a; b <= 40; b++) {
            for(int c = b; c <= 40; c++) {
                for(int d = c; d <= 40; d++) {
                    int[] arr2 = new int[]{a, b, c, d, a + b, b + c, c + d, d + a,
                    a + c, b + d, a + b + c, a + b + d, a + c + d, b + c + d,
                    a + b + c + d};

                    boolean Check = true;

                    Arrays.sort(arr);
                    Arrays.sort(arr2);
                    for(int x = 0; x < 15; x++) {
                        if(arr[x] != arr2[x]) {
                            Check = false;
                            break;
                        }
                    }
                    if(Check)
                    System.out.println(a + " " + b + " " + c + " " + d);
                }
            }
        }
    }
}