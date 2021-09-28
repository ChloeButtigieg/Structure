public class DivideSubstract implements DivideAlgorithm {
    private int numerator;
    private int denominator;

    public DivideSubstract(int a, int b) {
        this.numerator = a;
        this.denominator = b;
    }

    @Override
    public int run(int numerator, int denominator) {
        int resultat = 0;
        while(this.numerator >= this.denominator) {
            this.numerator = this.numerator - this.denominator;
            resultat = resultat + 1;
        }
        return resultat;
    }

    @Override
    public int getOperationCount() {
        return 0;
    }
}
