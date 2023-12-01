import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[15][15];

        for(int i = 0; i<n; i++){
            arr[i][0] = 1;
        }

        for(int i = 1; i<n; i++){
            for(int j = 1; j<i+1; j++){
                arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(arr[i][j] == 0) 
                System.out.print("  ");
                else
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}