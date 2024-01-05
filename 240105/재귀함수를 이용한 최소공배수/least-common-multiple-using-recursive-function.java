import java.util.*;
public class Main {
    static int[] arr;
    static int cm;
    // 배열의 모든 값들이 최댓값 cm과 나누어 떨어지는지 연산하는 함수 f(x)
    public static boolean f(int n) {
        if (n == 0) {
            return cm % arr[n] == 0;
        }
        return f(n - 1) && cm % arr[n] == 0;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 배열의 원소들 중 최대 값을 저장하기 위한 max 변수
        int max = 0;
        // 배열의 초기화
        arr = new int[n];
        for (int i = 0; i < n; i += 1) {
            int ele = sc.nextInt();
            arr[i] = ele;
            max = Math.max(ele, max);
        }

        int cnt = 1;
        cm = max;
        // 최댓값의 배수가 모든 원소로 나누어 떨어질 경우 까지 동작하는 while문
        // 나누어 떨어지지 않을 경우 최댓값의 배수를 증가시킨다.
        while (!f(n - 1)) {
            cm = max * cnt;
            cnt += 1;
        }

        System.out.println(cm);
    }
}