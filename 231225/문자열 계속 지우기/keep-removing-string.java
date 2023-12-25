import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int len = A.length();
        int len1 = B.length();

        while(true){

            int idx = -1;

            int cd = len - len1 +1;
            for(int i = 0; i<cd; i++){
                boolean check = true;
                for(int j = 0; j<len1; j++){
                    if(A.charAt(i+j) != B.charAt(j)){
                        check = false;
                        break;
                    }
                }

                if(check){
                    idx = i;
                    break;
                }
            }

            if(idx == -1)
            break;

            A = A.substring(0,idx) + A.substring(idx + len1);

            len = A.length();
        }

        System.out.print(A);
    }
}