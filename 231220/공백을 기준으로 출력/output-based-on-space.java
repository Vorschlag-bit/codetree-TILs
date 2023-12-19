import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        char[] arr = new char[200];
        int cnt = 0;


        for(int i = 0; i<str1.length(); i++){
            if (str1.charAt(i) != ' '){
                arr[cnt] = str1.charAt(i);
                cnt++;
            }
        }
        for(int i = 0; i<str2.length(); i++){
            if (str2.charAt(i) != ' '){
                arr[cnt] = str2.charAt(i);
                cnt++;
            }
        }
        for(int i = 0; i<cnt; i++){
            System.out.print(arr[i]);
        }
    }
}