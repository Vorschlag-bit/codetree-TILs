import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arrA = new int[a];
        int[] arrB = new int[b];
        int cnt = 0;

        for(int i = 0; i<a; i++){
            arrA[i] = sc.nextInt();
        }
        for(int i = 0; i<b; i++){
            arrB[i] = sc.nextInt();
        }

        for(int i = 0; i<b-a; i++){
          for(int j = 0; j<b; j++){
            if(arrB[j]==arrA[j+i])
            cnt++;
            if(cnt==b)
            break;
          } 
        }
        if(cnt>=b)
        System.out.print("Yes");
        else
        System.out.print("No");
    }
}