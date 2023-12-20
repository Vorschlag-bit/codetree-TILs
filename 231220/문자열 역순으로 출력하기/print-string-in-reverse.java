import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[4];
        for(int i = 0; i<4; i++){
            arr[i] = sc.next();
        }
        for(int i = 3; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}