import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JavaClassTest {
    @Test
    public void testHello() {
        assertEquals("java", new JavaClass().hello());
    }

    @Test
    public void testGroovyHello() {
        assertEquals("groovy", new JavaClass().groovyHello());
    }

    @Test
    public void testScalaHello() {
        assertEquals("scala", new JavaClass().scalaHello());
    }
}
