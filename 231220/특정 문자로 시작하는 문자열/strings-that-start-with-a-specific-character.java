import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = new String[20];

        for(int i = 0 ; i<n; i++){
            arr[i] = sc.next();
        }

        char a = sc.next().charAt(0);

        int cnt = 0;
        double sum = 0;

        for(int i = 0; i<n; i++){
            if(arr[i].charAt(0) == a){
                cnt++;
                sum += arr[i].length();
            }
        }
        System.out.printf("%d %.2f", cnt,sum/cnt);
    }
}