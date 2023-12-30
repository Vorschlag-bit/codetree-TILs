import java.util.Scanner;

public class Main {
    public static boolean isLeapYear(int y) {
        // 4의 배수가 아니라면 윤년이 확실히 아닙니다.
        if(y % 4 != 0)
            return false;
        
        // 여기까지 온 이상 4의 배수임을 가정해도 됩니다.
        // 그 중 100의 배수가 아니라면 확실히 윤년입니다.
        if(y % 100 != 0)
            return true;
        
        // 여기까지 온 이상 100의 배수임을 가정해도 됩니다.
        // 그 중 400의 배수라면 확실히 윤년입니다.
        if(y % 400 == 0)
            return true;
        
        // 여기까지 온 이상 100의 배수이지만, 400의 배수가 아닙니다.
        // 따라서 확실히 윤년이 아닙니다.
        return false;
    }
    
    public static boolean isExistDay(int y, int m, int d) {
        //                              1. 2.  3. 4.  5    6.  7.  8.  9. 10. 11  12
        int[] numOfDays = new int[]{0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
        // 윤년에 대한 처리를 진행합니다.
        numOfDays[2] = isLeapYear(y) ? 29 : 28;
    
        // d가 해당 월의 최대 일 수를 넘지 않아야 합니다.
        return d <= numOfDays[m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        // y년 m월 d일이 존재하지 않는다면 -1을 출력합니다.
        if(!isExistDay(y, m, d)) {
            System.out.print("-1");
            System.exit(0);
        }

        // y년 m월 d일이 존재한다면 달에 맞는 계절을 출력합니다.
        if(3 <= m && m <= 5) {
            System.out.print("Spring");
        }
        else if(6 <= m && m <= 8) {
            System.out.print("Summer");
        }
        else if(9 <= m && m <= 11) {
            System.out.print("Fall");
        }
        else {
            System.out.print("Winter");
        }
    }
}