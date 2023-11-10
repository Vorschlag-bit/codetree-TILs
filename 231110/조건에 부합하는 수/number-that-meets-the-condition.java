import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        for(long i =1;i<=a;i++){
            if(i%2==0&&i%4!=0)
            continue;
            if(i/8%2==0)
            continue;
            if(i%7<4)
            continue;
            System.out.print(i+" ");
        }
    }
}