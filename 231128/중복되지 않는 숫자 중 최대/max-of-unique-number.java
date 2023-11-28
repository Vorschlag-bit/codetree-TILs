import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[100];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        boolean check = true;

        for(int i = 0; i<n; i++){
            if(arr[i]>=max)
            max = arr[i];
            for(int j = 0; j<n; j++){
                if(arr[i]==arr[j]){
                    check = false;
                    break;
                }
            }
        }
        if(true) System.out.print(max);
        else System.out.print(-1);
    }
}