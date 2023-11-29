import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[1000];

        for(int i = 0; i<n; i++)
        arr[i] = sc.nextInt();

        int Maxgap = 0;

        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                int gap = arr[j] - arr[i];
                
                if(gap>Maxgap)
                Maxgap = gap;
            }
        }
        System.out.print(Maxgap);
    }
}