import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals;

class GroovyClassTest {
    @Test
    void testHello() {
        assertEquals('groovy', new GroovyClass().hello())
    }

    @Test
    void testJavaHello() {
        assertEquals('java', new GroovyClass().javaHello())
    }

    @Test
    void testScalaHello() {
        assertEquals('scala', new GroovyClass().scalaHello())
    }
}
