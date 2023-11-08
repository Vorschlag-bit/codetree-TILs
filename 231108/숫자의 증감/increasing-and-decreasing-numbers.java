import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in); 
        char c = sc.next().charAt(0);
        long n = sc.nextInt();
        if(c=='A'){
            for(long i =1;i<=n;i++){
                System.out.print(i+" ");
            }
        }
        else if(c=='D'){
            for(long i = n;i>=1;i--){
                System.out.print(i+" ");
            }
        }
    }
}