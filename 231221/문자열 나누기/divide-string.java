import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int j = 0;

        String[] arr = new String[1000];

        for(int i =0; i<n; i++){
            arr[i] = sc.next();
            j++;
        }

        for(int i = 0; i<j; i++){
            System.out.print(arr[i]);
            if(i%5==0)
            System.out.println();
        }
    }
}