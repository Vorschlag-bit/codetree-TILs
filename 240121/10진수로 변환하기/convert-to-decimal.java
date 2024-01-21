import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        char[] num = new char[n.length()];

        for(int i = 0; i < n.length(); i++) {
            num[i] = n.charAt(i);
        }
        int number = 0;
        int[] nums = new int[n.length()];
        for(int i = 0; i < n.length(); i++) {
            nums[i] = num[i] - '0';
            number = number * 2 + nums[i];
        }

        System.out.print(number);
    }
}