package finalStatic;

public class Math {
    //static var
    public static final double PI = 3.14;

    //field(instance var)
    private String name;

    public Math (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
