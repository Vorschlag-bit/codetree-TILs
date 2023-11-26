import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[10];
        for(int i = 0; i<10; i++){
            arr[i] = sc.next().charAt(0);
        }
        System.out.print(arr[1]+" "+arr[4]+" "+arr[7]);
    }
}