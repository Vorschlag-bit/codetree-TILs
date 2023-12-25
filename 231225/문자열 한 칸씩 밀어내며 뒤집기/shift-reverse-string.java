import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int len = s.length();

        String[] arr = new String[len];

        int q = sc.nextInt();

        for(int i = 0; i<q; i++){
            int qa = sc.nextInt();
            if(qa == 1){
                s = s.substring(1) + s.substring(0,1);
                System.out.println(s); 
            }
            else if(qa == 2){
                s = s.substring(len-1,len) + s.substring(0,len-1);
                System.out.println(s);
            }
            else{
                StringBuffer sb  = new StringBuffer(s);
                s = sb.reverse().toString();
                System.out.println(s);
            }
        }
    }
}