package joint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

//    @Test
//    public void testKotlinHello() {
//        assertEquals("kotlin", new ScalaClass().kotlinHello());
//    }
}
