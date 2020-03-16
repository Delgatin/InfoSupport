package first.hw4;

public class Season {

    private SeasonTemperature temperature;
    private String season;
    private String seasonTemp;

    public Season(SeasonTemperature temp, String season) {
        temperature = temp;
        this.season = season;
        seasonTemp = temp.toString();
    }

    public String getSeason() { return season; }

    @Override
    public String toString() {
        return "The temperature of the season " + season + " is " + temperature + " seasonTemp: " + seasonTemp;
    }
}
