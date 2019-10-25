package basics;

public class DataTypes {
    public static void main(String[] args) {
        // 8 - primitive data types
        //   - value(itself) gets stored in memory.

        // to create a variable in Java
        // type variableName = value;(syntax)
        byte a = 127; // 8 bits integer (-128 to 127)
        short b = 3432; // 16 bits integer (-2^15 to 2^15 - 1)
        int c = 13243; // 32 bits integer (-2^31 to 2^31 - 1)
        long d = 12343242;// 64 bits integer (-2^63 to 2^63 - 1)

        char e = 'd'; // 8 bits - single character (single quote)
        boolean f = true; // or false
        float g = 3.14f; // 32 bits floating point numbers
        double h = 3.14; // 64 bits (double-precision) floating point numbers

        // Operators
        // Arithmetic: +, -, *, /, %
        // Assignment: =
        // Comparison: >, <, >=, <=, ==, !=
        // Logical: &&(and), ||(or), !(not)
        // Increment/Decrement by one: ++, --
        int x = 10;
        int y = ++x; // y will be 11
        int y1 = x++; // y will be 10, x will be 11
    }
}
