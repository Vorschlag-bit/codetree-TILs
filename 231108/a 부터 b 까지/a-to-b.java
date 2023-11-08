import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        for(long i =a;i<=b;i++){
            System.out.print(i+" ");
            if(i%2==1){
                i=i*2-1;
            }
            else i=i+3-1;
        }
    }
}