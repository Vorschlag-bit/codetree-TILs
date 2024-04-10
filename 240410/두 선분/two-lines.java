import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int x3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken());

        boolean Check = false;

        if(x3 <= x1 && x1 <= x4) Check = true;
        else if(x3 <= x2 && x2 <= x4) Check = true;
        else if(x1 <= x3 && x3 <= x2) Check = true;
        else if(x1 <= x4 && x4 <= x2) Check = true;

        if(Check) System.out.println("intersecting");
        else System.out.println("nonintersecting");
    }
}