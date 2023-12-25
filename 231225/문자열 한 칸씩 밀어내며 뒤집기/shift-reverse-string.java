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
            }
            else if(qa == 2){
                s = s.substring(len-1,len) + s.substring(0,len-1);
            }
            else{
                for(int j = 0; j<len; j++){
                    if(len==1)
                    break;
                    s = s.substring(j,j+1) + s.substring(len-1-j, len-j);
            }
        }
        System.out.println(s);
    }
}
}