import java.util.*;
public class Main {
    public static int tri(int n, int m){
        int go = 1;
        for(int i = 1; i<=m; i++){
            go = go*n;
        }
        return go;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(tri(a,b));
    }
}