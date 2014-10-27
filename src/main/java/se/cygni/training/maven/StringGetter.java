package se.cygni.training.maven;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class StringGetter {

    public String getStaticString() {
        return "Hello world";
    }

    public String getStringFromResource() {
        final String resourceName = "strings.properties";
        System.out.println("Getting string from resource " + resourceName);
        Properties props = new Properties();
        InputStream stream = null;
        try {
            stream = this.getClass().getClassLoader()
                    .getResourceAsStream(resourceName);
            props.load(stream);
        } catch (IOException e) {
            System.err.println("Failed to get string from resource" + e.getMessage());
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException e) {
                    // Ignore
                }
            }

        }
        return props.getProperty("se.cygni.training.maven.string.1");
    }
}
