import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        int num = 1;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[i][j] = num;
                num++;
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}