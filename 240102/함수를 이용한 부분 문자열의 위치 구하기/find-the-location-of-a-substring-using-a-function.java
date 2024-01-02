import java.util.*;
public class Main {
    public static String str, s;

    public static boolean isSub(int start){
        int a = str.length();
        int b = s.length();

        if(start + b - 1 >= a)
        return false;

        for(int i = 0; i < b; i++){
            if(str.charAt(i+start) != s.charAt(i))
            return false;
        }

        return true;
    }
    
    public static int Index(){
        int a = str.length();
        for(int i = 0; i < a; i++){
            if(isSub(i))
            return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        str = sc.next();
        s = sc.next();

        System.out.println(Index());
    }
}