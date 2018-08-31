import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JavaGroovyClassTest {
    @Test
    public void testHello() {
        assertEquals("groovy", new GroovyClass().hello());
    }

    @Test
    public void testJavaHello() {
        assertEquals("java", new GroovyClass().javaHello());
    }

    @Test
    public void testScalaHello() {
        assertEquals("scala", new GroovyClass().scalaHello());
    }
}
