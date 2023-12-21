import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int n = sc.nextInt();

        int len = str.length();

            if(n>len){
                for(int j = len-1; j>=0; j--)
                System.out.print(str.charAt(j));
            }
            else
            for(int i = len -1; i>=len-n; i--)
            System.out.print(str.charAt(i));
        
    }
}