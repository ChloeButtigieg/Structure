public class DivideSubstract implements DivideAlgorithm {
    private int numerator;
    private int denominator;
    private int resultat = 0;

    public DivideSubstract() {
    }

    @Override
    public int run(int numerator, int denominator) {
        while(this.numerator >= this.denominator) {
            this.numerator = this.numerator - this.denominator;
            resultat = resultat + 1;
        }
        return resultat;
    }

    @Override
    public int getOperationCount() {
        return this.resultat;
    }
}
