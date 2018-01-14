import java.util.Observable;
import java.util.Observer;

public class UserObserver implements Observer {

    private WeatherObservable weather;

    @Override
    public void update(Observable o, Object arg) {
        weather = (WeatherObservable) o;
        System.out.println("Weather update: "+ weather.getWeather());

    }
}
