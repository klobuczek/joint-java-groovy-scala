import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JavaScalaClassTest {
    @Test
    public void testHello() {
        assertEquals("scala", new ScalaClass().hello());
    }

    @Test
    public void testJavaHello() {
        assertEquals("java", new ScalaClass().javaHello());
    }

    @Test
    public void testGroovyHello() {
        assertEquals("groovy", new ScalaClass().groovyHello());
    }
}
