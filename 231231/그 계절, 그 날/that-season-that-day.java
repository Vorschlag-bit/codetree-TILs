import java.util.*;

public class Main {
    public static boolean Yun(int y) {
        if (y % 4 != 0)
            return false;
        if (y % 100 == 0 && y % 400 != 0)
            return false;

        return true;
    }

    public static boolean Daycheck(int y, int m, int d) {
        if (Yun(y) && m == 2) {
            if (d <= 29)
                return true;
        } else {
            if (m == 2) {
                if (d <= 28)
                    return true;
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                if (d <= 30)
                    return true;
            } else {
                if (d <= 31)
                    return true;
            }
        }
        return false;
    }

    public static String season(int m) {
        if (m == 12 || m <= 2)
            return "Winter";
        if (m >= 3 && m <= 5)
            return "Spring";
        if (m >= 6 && m <= 8)
            return "Summer";
        if (m >= 9 && m <= 11)
            return "Fall";

        return "Invalid month";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (Daycheck(y, m, d)) {
            System.out.println(season(m));
        } else {
            System.out.println(-1);
        }
    }
}