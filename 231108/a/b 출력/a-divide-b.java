import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        String result = "0.";
        if(a>b){
            result=a/b+".";
            a%=b;
        }
        for(long i =0;i<20;i++){
            a*=10;
            result+=a/b;
            a%=b;
        }
        System.out.print(result);
    }
}