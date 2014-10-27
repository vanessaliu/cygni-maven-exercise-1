package se.cygni.training.maven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main class
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LOGGER.info("Starting up");
        StringGetter getter = new StringGetter();
        System.out.println(getter.getStringFromResource());
    }
}
