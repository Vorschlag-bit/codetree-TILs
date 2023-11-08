import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        if(a>b){
            for(long i = a;i>=b;i--)
            System.out.print(i+" ");
        }
        else{
            for(long i =b;i>=a;i--)
            System.out.print(i+" ");
        }
    }
}