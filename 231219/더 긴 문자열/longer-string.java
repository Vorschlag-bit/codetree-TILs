import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc  = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        boolean length = true;

        if(str1.length()>str2.length()){
            System.out.println(str1+" "+str1.length());
        }
        else if(str1.length()==str2.length()){
            System.out.println("same");
        }
        else{
            System.out.println(str2+" "+str2.length());
        }
    }
}