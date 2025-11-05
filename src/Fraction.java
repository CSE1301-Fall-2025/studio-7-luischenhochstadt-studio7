public class Fraction {
    private int Numerator;
    private int Denominator;

    public Fraction(int top, int bottom) {
        Numerator = top;
        Denominator = bottom;
    }

    public Fraction fractionSum(Fraction other) {
        int sumNumerator = other.getNumerator() * this.getDenominator() + this.getNumerator() * other.getDenominator();
        int sumDenominator = other.getDenominator() * this.getDenominator();
        return new Fraction(sumNumerator, sumDenominator);
    }

    public int getNumerator() {
        return Numerator;
    }

    public int getDenominator() {
        return Denominator;
    }
}
