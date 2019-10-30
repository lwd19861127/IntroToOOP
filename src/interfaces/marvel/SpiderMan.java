package interfaces.marvel;

public class SpiderMan extends SuperHero {
    public SpiderMan() {
        super("Peter Parker");
    }

    @Override
    public void fight() {
        System.out.println("Use web.");
    }
}
