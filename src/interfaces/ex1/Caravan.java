package interfaces.ex1;

public class Caravan implements Movable, Habitable {
    private int macCapacity;
    private int location; // distance from  0 (home) to current location

    public Caravan(int macCapacity) {
        this.macCapacity = macCapacity;
        this.location = 0;
    }

    public Caravan(int macCapacity, int location) {
        this.macCapacity = macCapacity;
        this.location = location;
    }

    @Override
    public void move(int distance) {
        location = location + distance;
    }

    @Override
    public boolean canFit(int inhabitants) {
        return inhabitants <= macCapacity;
    }

    @Override
    public boolean canMove() {
        return true;
    }
}
