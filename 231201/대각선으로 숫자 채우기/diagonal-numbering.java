import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[100][100];

        int cnt = 0;
        int num = 1;

        while(cnt != n+m+1){
        for(int row = 0; row<n; row++){
            for(int col = 0; col<m; col++){
                if(col+row == cnt){
                arr[row][col] = num;
                num++;
                }
            }
        }
        cnt++;
        }


        for(int row = 0; row<n; row++){
            for(int col = 0; col<m; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}