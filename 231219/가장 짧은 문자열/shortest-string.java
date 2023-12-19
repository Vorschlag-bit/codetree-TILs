import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        if(len1>len2&&len2>=len3){
            System.out.println(len1 - len3);
        }
        else if(len1>len3&&len3>=len2){
            System.out.println(len1-len2);
        }
        else if(len2>len1&&len1>=len3){
            System.out.println(len2-len3);
        }
        else if(len2>len3&&len3>=len1){
            System.out.println(len2-len1);
        }
        else if(len3>len2&&len2>=len1){
            System.out.println(len3-len1);
        }
        else if(len3>len1&&len1>=len2){
            System.out.println(len3-len2);
        }
    }
}