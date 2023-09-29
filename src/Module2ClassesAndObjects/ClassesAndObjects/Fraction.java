package Module2ClassesAndObjects.ClassesAndObjects;

public class Fraction {
    static final int MAX_DENOMINATOR_CAPACITY = 10000;
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }

    public Fraction(double number) {
        this.setNumerator(number);
        this.setDenominator(number);
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setNumerator(Double number) {
        number = number * MAX_DENOMINATOR_CAPACITY;
        this.numerator = number.intValue();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator <= 0) {
            denominator = 1;
        }
        this.denominator = denominator % MAX_DENOMINATOR_CAPACITY;
    }

    public void setDenominator(Double number) {
        if (number == 0D || number == 1D){
            this.denominator = 1;
        } else {
            this.denominator = MAX_DENOMINATOR_CAPACITY;
        }
    }

    public double getNumber() {
        return (double) numerator / denominator;
    }

    public Fraction multiplyByNumber(double number) {
        return new Fraction(this.getNumber() * number);
    }

    public Fraction divideByNumber(double number) {
        return new Fraction(this.getNumber() / number);
    }
}
