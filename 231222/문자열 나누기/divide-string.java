import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = "";

        String[] arr = new String[1000];

        for(int i =0; i<n; i++){
            str += sc.next();
        }

        for(int i = 0; i<str.length(); i++){
            if(i%5==0&&i!=0)
            System.out.println();
            System.out.print(str.charAt(i));
            
        }
    }
}