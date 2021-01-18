import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for(Observer o: observers) {
            o.update(temperature, humidity);
        }
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;

        measurementChanged();
    }
}
