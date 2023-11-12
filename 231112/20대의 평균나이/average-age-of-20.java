import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        long cnt = 0;
        while(true){
            long age = sc.nextInt();
            if(age<20||age>29){
                break;
            }
            sum+=age;
            cnt+=1;
        }
        System.out.printf("%.2f", (double)sum/cnt);
    }
}