import java.util.*;
class IntWrapper{
    int value;

    public IntWrapper(int value){
        this.value = value;
    }
}
public class Main {
    public static void change(IntWrapper a, IntWrapper b){
        if(a.value>b.value){
            a.value *= 2;
            b.value += 10;
        }
        else{
            a.value += 10;
            b.value *= 2;
        }

        return;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrapper aw = new IntWrapper(a);
        IntWrapper bw = new IntWrapper(b);

        change(aw, bw);

        a = aw.value;
        b = bw.value;
        System.out.println(a+" "+b);
    }
}