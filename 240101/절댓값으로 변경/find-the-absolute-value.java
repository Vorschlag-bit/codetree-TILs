import java.util.*;
public class Main {
    public static void absolute(int[] arr, int n){
        for(int i = 0; i<n; i++){
            if(arr[i]<0){
                arr[i] -= 2*arr[i];
            }
        }
        return;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        absolute(arr,n);

        for(int i = 0 ; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}