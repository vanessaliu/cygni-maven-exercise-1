package se.cygni.training.maven;

/**
 * Main class
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Starting up");
        StringGetter getter = new StringGetter();
        System.out.println(getter.getStringFromResource());
    }
}
