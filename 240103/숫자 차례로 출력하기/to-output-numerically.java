import java.util.*;
public class Main {
    public static void Printnum(int n){
        if(n==0)
        return;
        Printnum(n-1);
        System.out.print(n+" ");
    }

    public static void Printnum1(int n){
        if(n==0)
        return;
        System.out.print(n+" ");
        Printnum1(n-1);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Printnum(n);
        System.out.println();
        Printnum1(n);
    }
}