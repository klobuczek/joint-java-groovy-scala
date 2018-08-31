import org.junit.Test

import static org.junit.Assert.assertEquals

class GroovyScalaClassTest {
    @Test
    void testHello() {
        assertEquals('scala', new ScalaClass().hello())
    }

    @Test
    void testJavaHello() {
        assertEquals('java', new ScalaClass().javaHello())
    }

    @Test
    void testGroovyHello() {
        assertEquals('groovy', new ScalaClass().groovyHello())
    }
}
