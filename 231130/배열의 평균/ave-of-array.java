import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];

        int sum3 = 0;

        for(int i = 0; i<2; i++){
            int sum = 0;
            for(int j = 0; j<4; j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
                sum3 += arr[i][j];
            }
            System.out.printf("%.1f ", (double)sum/4);
        }
        System.out.println();
        for(int j = 0; j<4; j++){
            int sum2 = 0;
            for(int i = 0; i<2; i++){
                sum2 += arr[i][j];
            }
            System.out.printf("%.1f ", (double)sum2/2);
        }
        System.out.println();
        System.out.printf("%.1f ", (double)sum3/8);
    }
}