import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] counts = new int[1001];  // 각 숫자의 등장 횟수를 저장하는 배열

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            counts[num]++;
        }

        int max = -1;

        for (int i = 1; i <= 1000; i++) {
            if (counts[i] == 1 && i > max) {
                max = i;
            }
        }

        if (max == -1) {
            System.out.println(-1);
        } else {
            System.out.println(max);
        }
    }
}