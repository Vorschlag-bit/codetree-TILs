import java.util.*;
class Forecast {
    String Datum;
    String Woche;
    String Wetter;

    public Forecast(String Datum, String Woche, String Wetter) {
        this.Datum = Datum;
        this.Woche = Woche;
        this.Wetter = Wetter;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Forecast[] forecast = new Forecast[n];
        int lastidx = 0;

        for(int i = 0; i < n; i++){
            String day = sc.next();
            String week = sc.next();
            String weather = sc.next();

            forecast[i] = new Forecast(day, week, weather);
            if(forecast[i].Wetter.equals("Rain"))
            lastidx = i;
        }

        
        for(int i = 0; i < n; i++){
            if(forecast[i].Wetter.equals("Rain")){
            if(forecast[i].Datum.compareTo(forecast[lastidx].Datum) < 0)
            lastidx = i;
            }
        }

        System.out.print(forecast[lastidx].Datum + " " + forecast[lastidx].Woche + " " + forecast[lastidx].Wetter);
    }
}