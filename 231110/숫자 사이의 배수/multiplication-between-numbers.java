import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long sum = 0;
        long cnt = 0;
        for(long i =a;i<=b;i++){
            if(i%5==0||i%7==0){
                sum+=i;
                cnt+=1;
            }
        }
        System.out.printf(sum+" "+"%.1f", (double)sum/cnt);
    }
}