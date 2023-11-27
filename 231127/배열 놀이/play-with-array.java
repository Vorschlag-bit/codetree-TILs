import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n+1];
        int idx = -1;

        for(int i = 1; i<=n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i<=q; i++){
            int a = sc.nextInt();
            if(a==3){
                int b = sc.nextInt();
                int c = sc.nextInt();
                for(int j = b; j<=c; j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            } else {
            int b = sc.nextInt();
            if(a==1)
            System.out.println(arr[b]);

            else if(a==2){
                for(int j = 1; j<=n; j++){
                    idx=-1;
                    if(b==arr[j]){
                        idx=j;
                        break;
                    }
                    }
                    if(idx==-1)
                    System.out.println(0);
                    else
                    System.out.println(idx);
            }
            }
        }
    }
}