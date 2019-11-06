package midtermExam;

/**
 * @author Wenda Li
 */

import java.util.ArrayList;

public class Driver {
    private ArrayList<Vehicle> vehicles;

    public Driver() {
        this.vehicles = new ArrayList<Vehicle>();
    }

    private void addVehicle() {
        Car car1 = new Car(100);
        Car car2 = new Car(200);
        Car car3 = new Car(300);
        Boat boat1 = new Boat(1000);
        Boat boat2 = new Boat(2000);
        Boat boat3 = new Boat(3000);

        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);
        vehicles.add(boat1);
        vehicles.add(boat2);
        vehicles.add(boat3);
    }

    private void print() {
        for (Vehicle veh:vehicles) {
            System.out.println(veh.toString());
        }
    }

    private void accelerate() {
        for (Vehicle veh:vehicles) {
            veh.accelerate();
        }
    }

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.addVehicle();
        driver.print();
        driver.accelerate();
    }
}
