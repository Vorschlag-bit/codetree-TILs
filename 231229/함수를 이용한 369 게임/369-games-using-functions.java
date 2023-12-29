import java.util.*;
public class Main {
    public static boolean sam(int n, int m){
        for(int i = n; i<=m; i++){
            String str = Integer.toString(i);
            int len = str.length();
            for(int j = 0; j<len; j++){
                if(str.charAt(j)=='3'||str.charAt(j)=='6'||str.charAt(j)=='9')
            }
        }
        return;
    }
    public static boolean com(int n, int m){
        int cnt = 0;
        for(int i = n; i<=m; i++){
            if(i%3==0||sam(n,m))
            cnt++;
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        com(a,b);
    }
}