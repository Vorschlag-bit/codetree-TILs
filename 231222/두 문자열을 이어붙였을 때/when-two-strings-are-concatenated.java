import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String c = a+b;
        String d = b+a;

        boolean s = false;

        for(int i = 0; i<c.length(); i++){
            if(c.charAt(i)!= d.charAt(i)){
                s = false;
                break;
            }
            else s = true;
        }

        if(s == true)
        System.out.print("true");
        else if(s == false)
        System.out.print("false");

    }
}