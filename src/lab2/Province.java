package lab2;

import java.util.Arrays;
import java.util.List;

public class Province {
    public static final String[] provinces = {"Ontario", "Quebec", "Nova Scotia",
            "New Brunswick", "Manitoba",
            "British Columbia", "Prince Edward Island",
            "Saskatchewan", "Alberta", "Newfoundland and Labrador"};
    public static final String[] capitals = {"Toronto", "Quebec City", "Halifax",
            "Fredericton", "Winnipeg", "Victoria","Charlottetown",
            "Regina", "Edmonton", "St. John's"};

    private String name;     // e.g. “British Columbia”
    private String capital;  // e.g. “Victoria”
    private long population; // e.g. 2264823

    public Province() {
        name = "British Columbia";
        capital = "Victoria";
        population = 4648055;
    }

    public Province(String name, String capital, long population) {
        setName(name);
        setCapital(capital);
        setPopulation(population);
    }

    public String getDetails() {
        //The capital of British Columbia (population. 4648055) is Victoria.
        return "The capital of " + name + " (population. " + population + ") is " + capital + ".";
    }

    private Boolean isValidProvince(String province) {
        //https://www.mkyong.com/java/java-check-if-array-contains-a-certain-value/
        List<String> provincesList = Arrays.asList(provinces);
        if (provincesList.contains(province)) {
            return true;
        } else {
            return false;
        }
    }

    private Boolean isValidCapitalCity(String capital) {
        List<String> capitalsList = Arrays.asList(capitals);
        if (capitalsList.contains(capital)) {
            return true;
        } else {
            return false;
        }
    }

    private Boolean isValidPopulation(long population) {
        if (population >= 30_000 && population <= 15_000_000) {
            return true;
        } else {
            return false;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isValidProvince(name)) {
            this.name = name;
        } else {
            this.name = "British Columbia";
        }
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        if (isValidCapitalCity(capital)) {
            this.capital = capital;
        } else {
            this.capital = "Victoria";
        }
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        if (isValidPopulation(population)) {
            this.population = population;
        } else {
            this.population = 4648055;
        }
    }
}
