import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        for(long i = 1;i<=n;i++){
            if(i%3==0){
                System.out.print("0 ");
            }
            else if(i/10==3||i/10==6||i/10==9){
                System.out.print("0 ");
            }
            else if(i%10==3||i%10==6||i%10==9){
                System.out.print("0 ");
            }
            else System.out.print(i+" ");
        }
    }
}