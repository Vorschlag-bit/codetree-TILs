import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[10];
        int sum = 0;

        while(a>1){
            arr[a%b]++;
            a = a/b;
        }
        for(int i = 0; i<10; i++){
            sum+=arr[i]*arr[i];
        }
        System.out.print(sum);
    }
}