import java.util.*;

class Weather {
    String date;
    String day;
    String weather;

    public Weather(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Weather[] wea = new Weather[n];

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            wea[i] = new Weather(date, day, weather);
        }

        String ans = "";
        int minYear = Integer.MAX_VALUE;
        int minMonth = Integer.MAX_VALUE;
        int minDay = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (wea[i].weather.equals("Rain")) {

                String d = wea[i].date;

                int year = Integer.parseInt(d.substring(0, 4));
                int month = Integer.parseInt(d.substring(5, 7));
                int day = Integer.parseInt(d.substring(8, 10));

                // 날짜 비교
                if (year < minYear ||
                   (year == minYear && month < minMonth) ||
                   (year == minYear && month == minMonth && day < minDay)) {
                    
                    minYear = year;
                    minMonth = month;
                    minDay = day;
                    ans = wea[i].date + " " + wea[i].day + " " + wea[i].weather;
                }
            }
        }

        System.out.println(ans);
    }
}
