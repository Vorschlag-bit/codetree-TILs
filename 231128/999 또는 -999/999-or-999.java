import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<100; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==999||arr[i]==-999)
            break;
            if(arr[i]>=max)
            max = arr[i];
            if(arr[i]<=min)
            min = arr[i];
        }
        System.out.print(max+" "+min);
    }
}