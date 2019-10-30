package interfaces.marvel;

public class IronMan extends SuperHero implements Flyable {
    private int numOfSuits;
    private int numOfGfs;

    public IronMan(int numOfSuits, int numOfGfs) {
        super("Tony Stark");
        this.numOfGfs = numOfGfs;
        this.numOfSuits = numOfSuits;
    }

    @Override
    public void fly(int distance) {
        numOfSuits -= distance;
    }

    @Override
    public void fight() {
        numOfGfs -= 1;
    }
}
