package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public double add(double number1, double number2) {
        logger.debug("Number 1 : " + number1 + "gets added to Number 2: " + number2);
        return number1 + number2;
    }

    public double subtract(double number1, double number2) {
        logger.debug("Number 1 : " + number1 + "gets subtracted from Number 2: " + number2);
        return number1 - number2;
    }


    public double divide(double number1, double number2) {
        if (number2 == 0){
            logger.debug("You can´t divide through 0!");
            return Double.NaN;
        }

            logger.debug("Number 1 : " + number1 + "gets divided by Number 2: " + number2);
            return number1 / number2;
    }

    public double multiply(double number1, double number2) {
        logger.debug("Number 1 : " + number1 + "gets multiplied with Number 2: " + number2);
        return number1 * number2;
    }

}
