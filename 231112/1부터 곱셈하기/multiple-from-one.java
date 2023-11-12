import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long prod = 1;
        for(long i = 1;i<=10;i++){
            prod*=i;
            if(prod>=n){
                System.out.print(i);
                break;
            }
        }
    }
}