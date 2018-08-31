import org.junit.Test

import static org.junit.Assert.assertEquals

class GroovyJavaClassTest {
    @Test
    void testHello() {
        assertEquals('java', new JavaClass().hello())
    }

    @Test
    void testGroovyHello() {
        assertEquals('groovy', new JavaClass().groovyHello())
    }

    @Test
    void testScalaHello() {
        assertEquals('scala', new JavaClass().scalaHello())
    }
}
