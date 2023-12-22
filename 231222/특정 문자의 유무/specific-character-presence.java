import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        boolean ex = false;

        boolean ex1 = false;

        if(a.contains("ee")){
            ex = true;
        }

        if(a.contains("ab")){
            ex1 = true;
        }

        if(ex == true)
        System.out.print("Yes"+" ");
        else
        System.out.print("No"+" ");

        if(ex1 == true)
        System.out.print("Yes");
        else
        System.out.print("No");

    }
}