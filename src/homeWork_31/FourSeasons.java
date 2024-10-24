package homeWork_31;

public enum FourSeasons {
    WINTER("WINTER", 5),
    SUMMER("SUMMER", 25),
    SPRING("SPRING",10),
    AUTUMN("AUTUMN",12);

    private final String nameSeason;
    private int averageTemperature;

    FourSeasons(String nameSeason, int averageWeather) {
        this.nameSeason = nameSeason;
        this.averageTemperature = averageWeather;

    }
    public String testMethod(){
        return String.format("%d °C - averageTemperatur",  averageTemperature);
}
    @Override
    public String toString() {
        return "FourSeasons{" +
                "averageWeather=" + averageTemperature +
                '}';
    }

    public String getNameSeason() {
        return nameSeason;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }
}

