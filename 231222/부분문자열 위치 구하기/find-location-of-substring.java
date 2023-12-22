import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        String b = sc.next();

        int al = a.length();
        int bl = b.length();

        for(int i = 0; i<al; i++){
            if(i+bl-1>=al)
            continue;

            boolean m = true;
            for(int j = 0; j<bl; j++){
                if(a.charAt(i+j) != b.charAt(j))
                m = false;
            }

            if(m){
                System.out.print(i);
                System.exit(0);
            }
        }

        System.out.println(-1);
    }
}