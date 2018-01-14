
public class Main {

    public static void main(String[] args) {
        WeatherObservable weatherObservable = new WeatherObservable("");
        UserObserver userObserver = new UserObserver();
        weatherObservable.addObserver(userObserver);
        weatherObservable.setWeather("Weather will be great");
    }
}
