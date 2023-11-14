import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        for(long a = 0; a<2;a++){
            for(long i =0;i<n;i++){
                for(long j=0;j<n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}