import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long cnt=0;
        for(long i =1;i<=n;i++){
            if(i%2!=0&&i%3!=0&&i%5!=0){
                cnt+=1;
            }
        }
        System.out.print(cnt);
    }
}