import java.util.*;
public class Main {
    public static void Printnum(int n){
        if(n==0)
        return;
        System.out.print(n+" ");
        Printnum(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Printnum(n);
    }
}