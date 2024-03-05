import java.io.*;
import java.util.*;
public class Main {
    static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int ans = -1;
        boolean Carry = false;
        //주어지는 숫자는 최대 만의 자리이므로 5칸짜리 배열 생성.
        int[] figure1 = new int[5];
        int[] figure2 = new int[5];
        int[] figure3 = new int[5];
        //첫 번째 숫자를 고를 반복문.
        for(int i = 0; i < n; i++) {
            int sum = 0;
            int Pick1 = arr[i];
            figure1[0] = Pick1 % 10;//일의 자리 저장.
            figure1[1] = (Pick1/10) % 10;//십의 자리 저장.
            figure1[2] = (Pick1/100) % 10;// 백의 자리 저장.
            figure1[3] = (Pick1/1000) % 10;// 천의 자리 저장.
            figure1[4] = (Pick1/10000) % 10;//만의 자리 저장.
            for(int j = i + 1; j < n; j++) {
                //두 번째 숫자를 고를 반복문.
                int Pick2 = arr[j];
                figure2[0] = Pick2 % 10;
                figure2[1] = (Pick2/10) % 10;
                figure2[2] = (Pick2/100) % 10;
                figure2[3] = (Pick2/1000) % 10;
                figure2[4] = (Pick2/10000) % 10;
                for(int k = j + 1; k < n; k++) {
                    //세 번째 숫자를 고를 반복문.
                    int Pick3 = arr[k];
                    figure3[0] = Pick3 % 10;
                    figure3[1] = (Pick3/10) % 10;
                    figure3[2] = (Pick3/100) % 10;
                    figure3[3] = (Pick3/1000) % 10;
                    figure3[4] = (Pick3/10000) % 10;
                    for(int l = 0; l < 5; l++) {
                        //Carry 찾아낼 반복문.
                        if(figure1[l] + figure2[l] + figure3[l] >= 10) {
                            Carry = false;
                            break;
                        }
                        else Carry = true;
                    }
                    if(Carry){
                        sum = Pick1 + Pick2 +Pick3;
                        ans = Math.max(sum, ans);
                    }
                }
            }
        }
        System.out.print(ans);
    }
}