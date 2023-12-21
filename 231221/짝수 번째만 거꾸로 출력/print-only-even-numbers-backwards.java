import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[100];

        int j = 0;

        String a = sc.next();

        for(int i = 0; i<a.length(); i++){
            if(i%2==1){
                arr[j] = String.valueOf(a.charAt(i));
                j++;
            }
        }
        for(int i = j-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}