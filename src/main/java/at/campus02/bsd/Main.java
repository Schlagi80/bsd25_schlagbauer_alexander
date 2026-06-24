package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static final Logger logger = LogManager.getLogger(Main.class);

    static void main(String[] args) {
        System.out.println("Alexander Schlagbauer");


        logger.info("Eine Info-Nachricht zum Testen.");
        logger.error("Eine Error-Nachricht zum Testen.");

        Calculator calc = new Calculator();

        double sumadd = calc.add(20, 10);
        System.out.println("Result addition: " + sumadd);
        System.out.println();

        double sumsub = calc.subtract(20, 10);
        System.out.println("Result subtraction: " + sumsub);
        System.out.println();

        double sumdiv = calc.divide(20, 10);
        System.out.println("Result division: " + sumdiv);
        System.out.println();

        double summul = calc.multiply(20, 10);
        System.out.println("Result multiplication: " + summul);
        System.out.println();

    }
}
