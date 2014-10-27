package se.cygni.training.maven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class StringGetter {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringGetter.class);

    public String getStaticString() {
        String s = "Hello world";
        LOGGER.debug("Returning static string {}", s);
        return s;
    }

    public String getStringFromResource() {
        final String resourceName = "strings.properties";
        LOGGER.debug("Getting string from resource {}", resourceName);
        Properties props = new Properties();
        InputStream stream = null;
        try {
            stream = this.getClass().getClassLoader()
                    .getResourceAsStream(resourceName);
            props.load(stream);
        } catch (IOException e) {
            LOGGER.error("Failed to get string from resource", e);
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
