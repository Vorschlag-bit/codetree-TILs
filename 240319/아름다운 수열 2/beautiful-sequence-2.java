import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int[] b = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        int count = countBeautifulSubsequences(arr, b);
        System.out.println(count);
    }

    private static int countBeautifulSubsequences(int[] arr, int[] b) {
        int count = 0;
        for (int i = 0; i <= arr.length - b.length; i++) {
            for (int j = 0; j <= arr.length - b.length; j++) {
                if (isBeautiful(arr, b, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isBeautiful(int[] arr, int[] b, int startA, int startB) {
        for (int i = 0; i < b.length; i++) {
            if (arr[startA + i] != b[(startB + i) % b.length]) {
                return false;
            }
        }
        return true;
    }
}