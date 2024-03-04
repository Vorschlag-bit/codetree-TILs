import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        
        int length = str.length();
        char[] arr = new char[length];

        for(int i = 0; i < length; i++) {
            arr[i] = str.charAt(i);
        }

        int cnt = 0, start = 0;

        for(int i = 0; i < length; i++) {
            if(arr[i] == '(') {
                start = i;
            }
            else continue;
            for(int j = start; j < length; j++) {
                if(arr[j] == ')') cnt++;
            }
        }

        System.out.print(cnt);
    }
}