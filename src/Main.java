

public class Main {

    public static void assertResult(int result, int expected) {
        if (result != expected) {
            System.out.printf("%nAssertionError: %d != %d%n", result, expected);
            System.exit(1);
        } else {
            System.out.print('.');
        }
    }

    public static void main(String[] args) {
        assertResult(AUTMath.sum(2, 4), 6);
        assertResult(AUTMath.subtract(2, 4), -2);
        assertResult(AUTMath.multiply(3, 4), 12);
        assertResult(AUTMath.multiply(-3, 5), -15);
        assertResult(AUTMath.divide(8, 4), 2);
        assertResult(AUTMath.divide(4, 0), 4);
        assertResult(AUTMath.factorial(4), 24);
        assertResult(AUTMath.pow(2, 4), 16);
        assertResult(AUTMath.mod(27, 4), 3);
        assertResult(AUTMath.gcd(24, 42), 6);
    }
}