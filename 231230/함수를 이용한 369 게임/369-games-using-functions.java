import java.util.*;
public class Main {
    public static boolean sam(int n){
            String str = Integer.toString(n);
            int len = str.length();
            boolean ans = false;
            for(int j = 0; j<len; j++){
                if(str.charAt(j)=='3'||str.charAt(j)=='6'||str.charAt(j)=='9'){
                    ans = true;
                    break;
                }
            }
            return ans;
        }
    public static boolean com(int i){
        return (i%3==0||sam(i));    
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;

        for(int i = a; i<=b; i++){
            if(com(i))
            cnt++;
        }

        System.out.println(cnt);
    }
    }