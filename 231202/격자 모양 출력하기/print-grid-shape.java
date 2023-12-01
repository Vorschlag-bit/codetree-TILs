import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[11][11];

        for(int i = 0; i<m; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            arr[r][c] = r*c;
        }

       for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}