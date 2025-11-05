public class Complex {
    private double real;
    private double imaginary;

    public Complex(double initReal, double initImaginary) {
        real = initReal;
        imaginary = initImaginary;
    }

    public Complex sum(Complex other) {
        double sumReal = this.real + other.getReal();
        double sumI = this.imaginary + other.getI();
        return new Complex(sumReal, sumI);
    }

    public Complex product(Complex otherP) {
        double product1 = this.real * otherP.getReal() - this.imaginary * otherP.getI();
        double productI = this.real * otherP.getI() + this.imaginary * otherP.getReal();
        return new Complex(product1, productI);

    }

    public double getReal() {
        return real;
    }

    public double getI() {
        return imaginary;
    }

}
