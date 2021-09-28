import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {

    private static Chrono chrono = new Chrono();

    public static void main(String args[]) throws IOException {
        DivideAlgorithm divider = new NativeDivideAlgorithm();
        DivideSubstract divide = new DivideSubstract();
        Writer file = new FileWriter("divideNative.dat");
        Writer file2 = new FileWriter("divideSubstract.dat");

        for (int i = 200_000; i < 10_000_000; i = i + 20_000) {
            chrono.restart();
            int b = divide.run(i, 2);
            int q = divider.run(i, 2);
            chrono.stop();
            file.write(i + " " + chrono.getElapsedTime() +  " " + divider.getOperationCount() + "\n");
            file2.write(i + " " + chrono.getElapsedTime() +  " " + divide.getOperationCount() + "\n");
        }

        file.close();
        file2.close();
    }

    // Comment plotter les données avec gnuplot :
    // plot 'divideBySubtract.dat' using 1:2 with lines title "time",\
    //      'divideBySubtract.dat' using 1:3 with lines axis x1y2 title "iterations"
}