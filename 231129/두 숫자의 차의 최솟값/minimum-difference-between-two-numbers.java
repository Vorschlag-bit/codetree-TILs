import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[10];

        for(int i = 0; i<n; i++)
        arr[i] = sc.nextInt();

        int Mindif = 100;

        for(int i = n-1; i>=0; i--){
            for(int j = n-2; j>=0; j--){
                int dif = arr[i] - arr[j];
                if(dif < Mindif&&dif>0)
                Mindif = dif;
            }
        }
        System.out.print(Mindif);
    }
}