import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] num = new int[n];
        int[] c1 = new int[n];
        int[] c2 = new int[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            num[i] = Integer.parseInt(st.nextToken());
            c1[i] = Integer.parseInt(st.nextToken());
            c2[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;

        for(int i = 1; i <= 9; i++)
        for(int j = 1; j <= 9; j++)
        for(int k = 1; k <= 9; k++) {
            //3자리 룰렛을 돌릴 거고 내부에 반복문 하나를 더 놓아 우리가 저장한 배열 속 
            //3자리 숫자들과 비교를 하며, 카운트1과 카운트2까지 맞는지 확인 후 다 통과하면 cnt증가

            if(i == j || j == k || i == k)
            continue;

            boolean check = true; //n번만큼 입력 받은 테스트를 다 통과를 확인.
            for(int l = 0; l < n; l++) {
                //배열에 저장한 숫자들의 각 자릿수 비교.
                int a = num[l] / 100;
                int b = num[l] / 10 % 10;
                int c = num[l] % 10;

                int cnt1 = 0, cnt2 = 0;

                if(a == i) cnt1++;
                if(b == j) cnt1++;
                if(c == k) cnt1++;

                if(a == j || a == k) cnt2++;
                if(b == i || b == k) cnt2++;
                if(c == i || c == j) cnt2++;

                if(c1[l] != cnt1 || c2[l] != cnt2) {
                    check = false;
                    break;
                }
            }
            if(check) cnt++;
        }
        System.out.println(cnt);
    }
}