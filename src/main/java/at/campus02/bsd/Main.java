package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static final Logger logger = LogManager.getLogger(Main.class);

    static void main(String[] args) {
        System.out.println("Alexander Schlagbauer");



        logger.info("Eine Info-Nachricht zum Testen.");
        logger.error("Eine Error-Nachricht zum Testen.");

    }
}
