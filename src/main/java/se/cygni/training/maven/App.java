package se.cygni.training.maven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main class
 */
public class App {

    static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        //System.out.println("Starting up");
        logger.debug("Starting up,hello!!!");
        StringGetter getter = new StringGetter();
        System.out.println(getter.getStringFromResource());
    }
}
