import java.util.*;
public class Main {
    public static void PrintHelloworld(int N){
        if(N==0)
        return;

        PrintHelloworld(N-1);
        System.out.println("HelloWorld");
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        PrintHelloworld(N);
    }
}