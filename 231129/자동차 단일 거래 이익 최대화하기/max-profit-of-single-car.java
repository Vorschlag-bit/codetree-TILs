import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[1000];
        int[] b = new int[1000];

        for(int i = 0; i<n; i++)
        arr[i] = sc.nextInt();

        int gap = -1;

        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                if(arr[j]-arr[i]>gap)
                gap = arr[j] - arr[i];
            }
            b[i] = gap; 
        }
        int Maxgap = b[0];

        for(int i = 0; i<b.length; i++){
            if(b[i]>=Maxgap)
            Maxgap = b[i];
        }

        if(gap == -1) System.out.print(0);
        else System.out.print(Maxgap);
    }
}