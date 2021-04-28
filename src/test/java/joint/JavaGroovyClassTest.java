package joint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void testKotlinHello() {
        assertEquals("kotlin", new GroovyClass().kotlinHello());
    }
}
