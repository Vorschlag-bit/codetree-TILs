import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        while(true){
            long n = sc.nextInt();
            if(n==1){
                System.out.println("John");
            }
            else if(n==2){
                System.out.println("Tom");
            }
            else if(n==3){
                System.out.println("Paul");
            }
            else if(n==4){
                System.out.println("Sam");
            }
            else{
                System.out.println("Vacancy");
                break;
            }
        }
    }
}