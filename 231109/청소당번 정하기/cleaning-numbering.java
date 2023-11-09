import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n=sc.nextInt();
        long klass=0;
        long hall=0;
        long toilet=0;
        for(long i =1;i<=n;i++){
            if(i%12==0){
                toilet++;
            }
            if(i%3==0&&i%12!=0){
                hall++;
            }
            if(i%2==0&&i%3!=0&&i%12!=0)
            klass++;
        }
        System.out.print(klass+" "+hall+" "+toilet);
    }
}