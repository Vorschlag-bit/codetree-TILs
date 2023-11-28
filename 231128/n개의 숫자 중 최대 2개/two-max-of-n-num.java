import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max1 = arr[0];
        int max2 = arr[1];

        for(int i = 0; i<n; i++){
            if(max1<=arr[i])
            max1 = arr[i];
            else if(max2<arr[i])
            max2 = arr[i];
        }
        System.out.print(max1+" "+max2);
    }
}