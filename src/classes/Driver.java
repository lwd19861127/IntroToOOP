package classes;

public class Driver {
    public static void main(String[] args) {
        // create a new instance(object)
        Pokemon pikachu = new Pokemon();
        pikachu.name = "Pikachu";
        pikachu.type = "Electric";
        pikachu.attackPoint = 55;
        pikachu.healthPoint = 35;

        Pokemon mewtwo = new Pokemon();
        mewtwo.name = "mewtwo";
        mewtwo.type = "Dog";
        mewtwo.attackPoint = 35;
        mewtwo.healthPoint = 50;

        Pokemon charzard = new Pokemon("Charzard" , "Fire/Fly", 78, 84);
        Pokemon magikarp = null;

        pikachu.attack(mewtwo);
        System.out.println(mewtwo.healthPoint);
        pikachu.evolve();
        System.out.println(pikachu.healthPoint);
    }
}
