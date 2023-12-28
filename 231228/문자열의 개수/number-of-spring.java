import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        String[] arr = new String[200];

        for(int i = 0; i<200; i++){
            String s = sc.next();

            if(s.equals("0"))
            break;

            cnt++;

            if(i%2==0){
                arr[i] = s;
            }
        }

        System.out.println(cnt);

        for(int i = 0; i<cnt; i+=2){
            System.out.println(arr[i]);
        }
    }
}