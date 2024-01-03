import java.util.*;
public class Main {
    public static void Printstars(int n) {
        if(n == 0)
        return;
        for(int i = 0; i < n; i++) {
            System.out.print("*"+" ");
        }
        System.out.println();
        Printstars(n-1);
        for(int i = 0; i < n; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Printstars(n);
    }
}