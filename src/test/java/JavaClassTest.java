import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

//    @Test
//    public void testKotlinHello() {
//        assertEquals("kotlin", new JavaClass().kotlinHello());
//    }
}
