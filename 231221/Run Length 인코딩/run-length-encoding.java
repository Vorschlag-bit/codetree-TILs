import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int cnt = 1;  // 카운트 초기값을 1로 설정
        int j = 0;

        String[] arr = new String[100];

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                arr[j] = String.valueOf(str.charAt(i));
                j++;
                arr[j] = String.valueOf(cnt);
                j++;
                cnt = 1;  // 카운트 초기화
            } else {
                cnt++;
            }
        }

        // 마지막 문자와 카운트 처리
        arr[j] = String.valueOf(str.charAt(str.length() - 1));
        j++;
        arr[j] = String.valueOf(cnt);

        // 결과 출력
        System.out.println(j+1);

        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i]);
        }
    }
}