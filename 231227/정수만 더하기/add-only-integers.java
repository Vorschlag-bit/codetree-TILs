import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        int sum = 0;

        for(int i = 0; i<A.length(); i++){
            if(Character.isDigit(A.charAt(i))){
                sum += A.charAt(i)-48;
            }
        }
        System.out.println(sum);
    }
}