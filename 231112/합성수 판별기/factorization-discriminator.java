import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean state =false;
        for(long i =2;i<n;i++){
            if(n%i==0){
                state = true;
                break;
            }
            }
            if(state==true){
                System.out.print("C");
            }
            else System.out.print("N");
        }
    }