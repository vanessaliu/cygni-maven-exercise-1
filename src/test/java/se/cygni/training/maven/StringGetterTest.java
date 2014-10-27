package se.cygni.training.maven;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringGetterTest {

    private StringGetter getter;

    @Before
    public void setup() {
        getter = new StringGetter();
    }

    @Test
    public void testString() {
        assertEquals("Hello world", getter.getStaticString());
    }

}
