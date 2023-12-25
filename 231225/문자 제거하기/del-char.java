import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int len = s.length();

        for(int i = 0; i<20; i++){
            if(len == 0){
                break;
            }
            int n = sc.nextInt();
            s = s.substring(0,n-1)+s.substring(n);
            System.out.println(s);
        }
    }
}