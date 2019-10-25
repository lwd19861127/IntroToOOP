package polymorphism;

import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        Employee rick = new SoftwareDeveloper(
                "50", 30000, new Date(), "Java");
        Employee biance = new Designer(
                "35",40000, new Date(), true);
        Employee shohei = new ProductManager(
                "51", 60000, new Date(), "#123");
        Employee wenda = new DataScientist(
                "30", 6000, new Date(), "#123-d");

        // I want to create an array (collection) to store all my Employees.
        // So, I can calculate the total salary for my team.
        Employee[] dreamTeam = {rick, biance, shohei, wenda};
        int totalSalary = 0;
        for (Employee e: dreamTeam) {
            // dynamically(at runtime)
            // it calls the getSalary() from SoftwareDeveloper
            totalSalary += e.getSalary();
        }
        System.out.println("Total Salary: " + totalSalary);

        // I want to know Rick's specialty!
        // Compile-time => Rick is Employee type
        // Run-time => Because Rick is actually SoftwareDeveloper,
        //             we can down-cast rick to SoftwareDeveloper
        System.out.println(((SoftwareDeveloper)dreamTeam[0]).getSpecialty());

        // What if Software developers always (secretly) get bonus (+ $20000)

        for (Employee e: dreamTeam) {
            e.work();
        }
    }
}
