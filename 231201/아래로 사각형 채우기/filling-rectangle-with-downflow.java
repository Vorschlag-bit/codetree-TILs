import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];


        for(int i = 0; i<n; i++){
            int num = 1;
            for(int j = 0; j<n; j++){
                arr[i][j] = i+num;
                num+=n;
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}