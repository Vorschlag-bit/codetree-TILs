import java.util.*;
public class Main {
    public static boolean year(int n){
        
        if(n%4==0&&n%100==0&&n%400==0)
        return true;
        if(n%4==0&&n%100==0)
        return false;
        if(n%4==0)
        return true;

        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        if(year(y))
        System.out.println("true");
        else
        System.out.println("false");
    }
}