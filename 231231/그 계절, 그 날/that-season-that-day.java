import java.util.*;
public class Main {
    public static boolean Yun(int y){
        if(y%4!=0)
        return false;
        if(y%100!=0)
        return true;
        if(y%400!=0)
        return false;

        return true;
    }
    public static boolean Daycheck(int y,int m, int d){
        if(Yun(y)&&m==2){
            if(d<=29)
            return true;
        }
        else if(m==2)
        if(d<=28)
        return true;
        else if(m==4||m==6||m==9||m==11)
        if(d<=30)
        return true;
        else
        if(d<=31)
        return true;

        return false;
    }
    public static boolean season(int m){
        if(m==12||m<=2)
        System.out.println("Winter");
        if(m>=3&&m<=5)
        System.out.println("Spring");
        if(m>=6&&m<=8)
        System.out.println("Summer");
        if(m>=9&&m<=11)
        System.out.println("Fall");
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if(Daycheck(y,m,d))
        season(m);
        else
        System.out.println(-1);
    }
}