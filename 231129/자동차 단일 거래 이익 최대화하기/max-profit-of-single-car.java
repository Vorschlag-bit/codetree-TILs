import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[1000];

        for(int i = 0; i<n; i++)
        arr[i] = sc.nextInt();

        int min = 100; 
        int max = 0; 
        int minidx = 0;

        for(int i = 0; i<n; i++){
            if(arr[i]<min){
             min = arr[i];
             max = arr[i];
             minidx = i;
            }
        }
        for(int i = minidx; i<n; i++){
            if(arr[i]>max)
            max = arr[i];
        }

        if(max==min)
        System.out.print(0);
        else
        System.out.print(max-min);
    }
}