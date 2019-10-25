package lab2;

public class Canada {
    private Province[] provinces;

    public Canada() {
        setProvinces();
    }

    public void displayAllProvinces() {
        for (Province province: provinces) {
            System.out.println(province.getDetails());
        }
    }

    public int getNumOfProvincesBetween(int min, int max) {
        min *= 1_000_000;
        max *= 1_000_000;
        int count = 0;
        for (Province province: provinces) {
            if (province.getPopulation() >= min && province.getPopulation() <= max) {
                count++;
            }
        }
        return count;
    }

    public Province[] getProvinces() {
        return provinces;
    }

    public void setProvinces() {
        provinces = new Province[]{new Province("Ontario", "Toronto", 13_448_494),
        new Province("Quebec", "Quebec City", 8_164_361),
        new Province("Nova Scotia", "Halifax", 923_598),
        new Province("New Brunswick", "Fredericton", 747_101),
        new Province("Manitoba", "Winnipeg", 1_278_365),
        new Province("British Columbia", "Victoria", 4_648_055),
        new Province("Prince Edward Island", "Charlottetown", 142_907),
        new Province("Saskatchewan", "Regina", 1_098_352),
        new Province("Alberta", "Edmonton", 4_067_175),
        new Province("Newfoundland and Labrador", "St. John's", 519_716)};
    }
}
