public class StatisticsDisplay implements Observer, DisplayElement {
    private int recordCount;
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        recordCount = 0;
        this.temperature = 0f;
        this.humidity = 0f;
    }

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = (this.temperature * recordCount + temperature) / (recordCount + 1);
        this.humidity = (this.humidity * recordCount + humidity) / (recordCount + 1);
        recordCount++;

        display();
    }

    @Override
    public void display() {
        System.out.println("Average climate(" + recordCount + "): " + temperature +
                "F degrees and " + humidity + "% humidity.");
    }
}
