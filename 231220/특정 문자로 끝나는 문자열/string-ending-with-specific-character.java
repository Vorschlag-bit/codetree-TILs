import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];

        for(int i = 0; i<10; i++){
            arr[i] = sc.next();
        }

        char a = sc.next().charAt(0);

        int cnt = 0;

        for(int i = 0; i<10; i++){
            if(arr[i].charAt(arr[i].length()-1) == a){
                System.out.println(arr[i]);
                cnt++;
            }
        }
        if(cnt == 0)
        System.out.println("None");
    }
}