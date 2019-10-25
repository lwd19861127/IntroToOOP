package lab1;

public class Model {
    /**
     * @author Wenda Li
     */

    // constance - value does not change
    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean traveler;
    private boolean smoker;

    /**
     * @param
     */
    public Model() { }

    /**
     *
     * @param firstName
     * @param lastName
     * @param height
     * @param weight
     * @param traveler
     * @param smoker
     */
    public Model(String firstName, String lastName, int height, double weight, boolean traveler, boolean smoker) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setTraveler(traveler);
        setSmoker(smoker);
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param height
     * @param weight
     */
    public Model(String firstName, String lastName, int height, double weight) {
        this(firstName, lastName, height, weight, true, false);
    }

    /**
     *
     * @return e.g. "5 feet 6 inches"
     */
    public String getHeightInFeetAndInches() {
        int feet = height / INCHES_PER_FOOT;
        int inches = height % INCHES_PER_FOOT;
        if (inches == 0) {
            return String.format("%d feet", feet);
        } else if (inches == 1) {
            return String.format("%d feet %d inch", feet, inches);
        } else {
            return String.format("%d feet %d inches", feet, inches);
        }
    }

    /**
     *
     * @param kilograms
     */
    public void setWeight(long kilograms) {
        weight = kilograms * POUNDS_PER_KG;
    }

    /**
     *
     * @param feet
     * @param inches
     */
    public void setHeight(int feet, int inches) {
        height = feet * INCHES_PER_FOOT + inches;
    }

    /**
     *
     */
    public void printDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
        /*
        if (traveler) {
            System.out.println("Does travel");
        } else {
            System.out.println("Does not travel");
        }
        if (smoker) {
            System.out.println("Does smoke");
        } else {
            System.out.println("Does not smoke");
        }
        */
        String travelMessage = traveler ? "Does travel" : "Does not travel";
        System.out.println(travelMessage);
        String smokeMessage = smoker ? "Does smoke" : "Does not smoke";
        System.out.println(smokeMessage);
    }

    /**
     *
     * @return
     */
    public int calculatePayDollarsPerHour() {
        int perHourPayRate = BASE_RATE_DOLLARS_PER_HOUR;
        if (height >= TALL_INCHES && weight < THIN_POUNDS) {
            perHourPayRate += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        }
        if (traveler) {
            perHourPayRate += TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }
        if (smoker) {
            perHourPayRate -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }
        return perHourPayRate;
    }

    /**
     *
     */
    public void displayModelDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println(String.format("Weight: %.1f pounds", getWeight()));
        if (traveler) {
            System.out.println("Travels: yep");
        } else {
            System.out.println("Travels: nope");
        }
        if (smoker) {
            System.out.println("Smokes: yep");
        } else {
            System.out.println("Smokes: nope");
        }
        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());
    }

    /**
     *
     * @return weight
     */
    public long getWeightKg() {
        return Math.round(weight / POUNDS_PER_KG);
    }

    /**
     *
     * @param
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        if (firstName.length() >= 3 && firstName.length() <= 20) {
            this.firstName = firstName;
        }
    }

    /**
     *
     * @param
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        if (lastName.length() >= 3 && lastName.length() <=20) {
            this.lastName = lastName;
        }
    }

    /**
     *
     * @param
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     *
     * @param height
     */
    public void setHeight(int height) {
        if (height >= 24 && height <= 84) {
            this.height = height;
        }
    }

    /**
     *
     * @param
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     *
     * @param weight
     */
    public void setWeight(double weight) {
        if (weight >= 80 && weight <= 280) {
            this.weight = weight;
        }
    }

    /**
     *
     * @param
     * @return traveler
     */
    public boolean isTraveler() {
        return traveler;
    }

    /**
     *
     * @param traveler
     */
    public void setTraveler(boolean traveler) {
        this.traveler = traveler;
    }

    /**
     *
     * @param
     * @return smoker
     */
    public boolean isSmoker() {
        return smoker;
    }

    /**
     *
     * @param smoker
     */
    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }
}