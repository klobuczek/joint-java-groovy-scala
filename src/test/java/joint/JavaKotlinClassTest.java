package joint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaKotlinClassTest {
    @Test
    public void testHello() {
        assertEquals("kotlin", new KotlinClass().hello());
    }

    @Test
    public void testJavaHello() {
        assertEquals("java", new KotlinClass().javaHello());
    }

    @Test
    public void testGroovyHello() {
        assertEquals("groovy", new KotlinClass().groovyHello());
    }
}
