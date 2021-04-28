package joint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaScalaClassTest {
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

//    @Test
//    public void testScalaHello() {
//        assertEquals("scala", new KotlinClass().scalaHello());
//    }
}
