package interfaces.ex1;

public class Driver {
    public static void main(String[] args) {
        Car c1 = new Car("Lamborghini");
        House h1 = new House(3);
        Caravan cr1 = new Caravan(5);

        // I want to group all the movables.. (Car, Caravan)
        Movable[] movables = {c1, cr1};
        for(Movable mv: movables) {
            mv.move(10);
        }

        // down-casting
        Caravan cara1 = (Caravan) movables[1];
        System.out.println(cara1.canFit(3));

        // down-casting to wrong type
        // 'ClassCastException'
        Car car1 = (Car) movables[1]; // actually Caravan
        // car1.move(50);

    }
}
