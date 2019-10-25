package finalStatic;

public class TimeClient {
    public static void main(String[] args) {
        Time t0 = new Time();
        Time t1 = new Time(23);
        Time t2 = new Time(9,11);
        Time t3 = new Time(10,2,5);

        Time[] times = {t0, t1, t2, t3};
        for (Time time: times) {
            System.out.println(time.toStandardForm());
            System.out.println(time.toUniversalForm());
        }
        System.out.println("I created Time objects " + Time.instanceCount + " times");
    }
}
