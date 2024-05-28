import java.io.*;
import java.util.*;
public class Main {
    static int Ascore = 0, Bscore = 0, Cscore = 0;
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        String[] person = new String[n];
        int[] point = new int[n];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            person[i] = st.nextToken();
            point[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;

        for(int i = 0; i < n; i++) {
            //A점수 변동
            if(person[i].equals("A")) {
                if(Check(Ascore, Bscore, Cscore) != Check(Ascore + point[i], Bscore, Cscore))
                ans++;

                Ascore += point[i];
            }

            //B점수 변동
            else if(person[i].equals("B")) {
                if(Check(Ascore, Bscore, Cscore) != Check(Ascore, Bscore + point[i], Cscore))
                ans++;

                Bscore += point[i];
            }
            //C점수 변동
            else {
                if(Check(Ascore, Bscore, Cscore) != Check(Ascore, Bscore, Cscore + point[i]))
                ans++;

                Cscore += point[i];
            }
        }
        System.out.print(ans);
    }
    static int Check(int as, int bs, int cs) {
        //1. A만 등록
        if(as > bs && as > cs && bs != cs)
        return 1;
        //2. B만 등록
        else if(bs > as && bs > cs && as != cs)
        return 2;
        //3. C만 등록
        else if(cs > as && cs > bs && as != bs)
        return 3;
        //4. A, B 등록
        else if(as == bs && as > cs)
        return 4;
        //5. B, C 등록
        else if(bs == cs && cs > as)
        return 5;
        //6. A, C 등록
        else if(as == cs && as > bs)
        return 6;
        //7.모두
        else return 7;
    }
}