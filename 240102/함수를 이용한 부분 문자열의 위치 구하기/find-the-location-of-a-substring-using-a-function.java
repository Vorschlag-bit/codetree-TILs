import java.util.*;
public class Main {
    public static String str, s;
    public static boolean check(int startidx){
        int a = str.length();
        int b = s.length();

        if(startidx + m - 1 >= str)
        return false;

        for(int i = 0; i < m; i++){
        if(str.charAt(startidx + i) != s.charAt(i))
        return false;
    }
    return true;
    }
    public static int findIndex(){
        int a = str.length();
        for(int i = 0; i < a; i++)
        if(check(i))
        return i;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String s = sc.next();

        System.out.println(findIndex());
    }
}