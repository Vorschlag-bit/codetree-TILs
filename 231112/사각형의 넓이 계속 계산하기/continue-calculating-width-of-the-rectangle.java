import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextInt();
            long b = sc.nextInt();
            String n = sc.next();
            System.out.println(a*b);
            if(n.equals("C")){
                break;
            }
        }
    }
}