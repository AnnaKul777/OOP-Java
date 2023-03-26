package Seminar6.model;
import Seminar6.model.weather.Weather;
import com.google.gson.Gson;


public class Formatter {
    public Weather parse(String info) {
        Gson gson = new Gson();
        Weather weather = gson.fromJson(info, Weather.class);
        return weather;
    }
}
