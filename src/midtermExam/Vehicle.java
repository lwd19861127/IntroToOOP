package midtermExam;

/**
 * @author Wenda Li
 */

public abstract class Vehicle implements Steerable{
    private int weightPounds;

    public Vehicle(int weightPounds) {
        this.weightPounds = weightPounds;
    }

    public int getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(int weightPounds) {
        this.weightPounds = weightPounds;
    }

    @Override
    public boolean equals(Object obj) {
        Vehicle veh = (Vehicle)obj;
        return weightPounds == veh.getWeightPounds();
    }

    @Override
    public String toString() {
        return "weightPounds = " + weightPounds;
    }
}
