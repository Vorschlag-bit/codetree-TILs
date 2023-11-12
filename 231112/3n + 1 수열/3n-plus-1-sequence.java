import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long cnt=0;
        while(true){
            long n =sc.nextInt();
            if(n%2!=0){
                n=n*3+1;
            }
            else{
                n/=2;
            }
            cnt+=1;
            if(n==1){
                System.out.print(cnt);
                break;
            }
        }
    }
}