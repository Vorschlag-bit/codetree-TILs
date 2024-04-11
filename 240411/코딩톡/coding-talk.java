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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken()) - 1;

        Message[] ms = new Message[m];
        boolean[] talker = new boolean[n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int v = Integer.parseInt(st.nextToken());

            ms[i] = new Message(c, v);
        }

        for (int i = p; i >= 0; i--) {
            if (ms[i].view == ms[p].view) {
                talker[ms[i].par - 'A'] = true;
            } else {
                break;
            }
        }

        for (int i = p + 1; i < m; i++) {
            talker[ms[i].par - 'A'] = true;
        }

        for (int i = 0; i < n; i++) {
            if (!talker[i]) {
                System.out.print((char) ('A' + i) + " ");
            }
        }
    }
}