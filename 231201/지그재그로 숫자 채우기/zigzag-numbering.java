import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i<n; i++){
            int num = i;
            for(int j = 0; j<m; j++){
                
                if(j%2==1){
                    num += 2*(n-i)-1;
                    arr[i][j] = num;
                }
                if(j%2==0&&j!=0){
                    num += 2*i+1;
                    arr[i][j] = num;
                }
                if(j==0){
                    arr[i][j] = num;
                }
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