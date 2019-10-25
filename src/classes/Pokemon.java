package classes;

import java.sql.SQLOutput;

// blueprint (template)
public class Pokemon {
    // fields(attributes) - variable
    String name;
    String type;
    int healthPoint;
    int attackPoint;

    // constructor: a special method to create an object(instance)
    // - default constructor: without any parameters
    // - default constructor is given by the compiler if you don't have any constructors.
    Pokemon() {
        // null keyword: refers to an empty object (uninitialized object)
        name = null;
        type = null;
        healthPoint = 0;
        attackPoint = 0;
    }

    Pokemon(String n, String t, int h, int a) {
        // initialize your fields
        // 'this' (optional): "self reference"
        this.name = n;
        this.type = t;
        this.healthPoint = h;
        this.attackPoint = a;
    }

    // methods (behaviors, actions)
    void attack(Pokemon enemy) {
        if (enemy.dodge()) {
            System.out.println(enemy.name + " dodged my super-power attack!");
        } else {
            System.out.println("I'm attacking you with " + attackPoint);
            enemy.healthPoint -= attackPoint;
        }
    }

    boolean dodge() {
        // Math.random(): returns a random double value from 0.0 - 1.0
        return Math.random() > 0.5;
    }

    void evolve() {
        System.out.println("I'm evolving");
        healthPoint += 20;
        attackPoint += 20;
    }
}
