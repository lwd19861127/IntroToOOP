package lab1;

public class Driver {
    public static void main(String[] args) {
        Model Wenda = new Model("Wenda", "Lee", 80,120, true, false);
        System.out.println(Wenda.getHeightInFeetAndInches());
        System.out.println(Wenda.getWeightKg());
        Wenda.setWeight(40);
        System.out.println(Wenda.getWeight());
        Wenda.setHeight(6,9);
        System.out.println(Wenda.getHeight());
        Wenda.printDetails();
        System.out.println(Wenda.calculatePayDollarsPerHour());
        Wenda.displayModelDetails();
    }
}
