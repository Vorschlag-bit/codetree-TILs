import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[3][3];

        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for(int j = 0; j < 3; j++) {
                char num = str.charAt(j);
                arr[i][j] = num - '0';
            }
        }

        int ans = 0;
        for(int i = 1; i <= 9; i++)
        //하나 뽑고 다른 하나는 겹치지 않게 뽑기
        for(int j = i + 1; j <= 9; j++) {
            //승리는 '가로', '세로', '대각선'뿐이니 3가지 조건으로
            //나눠서 완전탐색 진행.

            boolean Check = false;

            int numI = 0;
            int numJ = 0;
            //가로
            for(int k = 0; k < 3; k++) {
                numI = 0;
                numJ = 0;
                for(int l = 0; l < 3; l++) {
                if(arr[k][l] == i)
                numI++;
                if(arr[k][l] == j)
                numJ++;
            }
            if(numI + numJ == 3 && numI >= 1 && numJ >= 1)
            Check = true;
            }

            //세로
            for(int k = 0; k < 3; k++) {
                numI = 0;
                numJ = 0;
                for(int l = 0; l < 3; l++) {
                if(arr[l][k] == i)
                numI++;
                if(arr[l][k] == j)
                numJ++;
            }
            if(numI + numJ == 3 && numI >= 1 && numJ >= 1)
            Check = true;
            }

            numI = 0;
            numJ = 0;
            //대각선1
            for(int k = 0; k < 3; k++) {
                if(arr[k][k] == i)
                numI++;
                if(arr[k][k] == j)
                numJ++;
            }
            if(numI + numJ == 3 && numI >= 1 && numJ >= 1)
                Check = true;

            numI = 0;
            numJ = 0;
            for(int k = 0; k < 3; k++) {
                if(arr[k][2 - k] == i)
                numI++;
                if(arr[k][2- k] == j)
                numJ++;
            }
            if(numI + numJ == 3 && numI >= 1 && numJ >= 1)
            Check = true;

            if(Check) ans++;
        }
        System.out.println(ans);
    }
}