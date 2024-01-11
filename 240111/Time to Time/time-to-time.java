import java.util.*;
import java.io.*;
public class Main {
    public static int Cal(int Sh, int Sm, int Fh, int Fm) {
        return (Sh*60 + Sm) - (Fh*60 + Fm);
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Sh = Integer.parseInt(st.nextToken());
        int Sm = Integer.parseInt(st.nextToken());
        int Fh = Integer.parseInt(st.nextToken());
        int Fm = Integer.parseInt(st.nextToken());

        System.out.print(Math.abs(Cal(Sh, Sm, Fh, Fm)));
    }
}