package greatest_common_denominator;

public class GDC {
    public int findDenominator(int a, int b) {
        if(b == 0) return a;
        return findDenominator(b, a % b);
    }
}

