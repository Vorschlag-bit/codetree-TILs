import java.io.*;
import java.util.*;
class Message {
    char par;
    int view;

    public Message(char par, int view) {
        this.par = par;
        this.view = view;
    }

}
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken()) - 1;

        Message[] ms = new Message[m];
        //읽었는지 확인하기 위한 배열.
        boolean[] talker = new boolean[n];

         for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int v = Integer.parseInt(st.nextToken());

            ms[i] = new Message(c, v);
         }
         //만약 다 봤다면 true처리
         if(ms[p].view == 0)
         Arrays.fill(talker, true);

         for(int i = p; i < m; i++) {
            //p번째 메세지 이후부터 보낸 이들 확인.
            int viewer = ms[i].par - 'A';
            talker[viewer] = true;
         }

         for(int i = 0; i < m; i++) {
            if(talker[i] == false)
            System.out.print((char)('A' + i) +" ");
         }
    }
}