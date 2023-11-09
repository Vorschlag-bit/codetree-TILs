import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long a;
        long cnt1=0;
        long cnt2=0;
        for(long i = 1 ; i<=10; i++){
            a=sc.nextInt();
            if(a%5==0){
                cnt1++;
            }
            if(a%3==0){
                cnt2++;
            }
        }
        System.out.print(cnt1+" "+cnt2);
    }
}