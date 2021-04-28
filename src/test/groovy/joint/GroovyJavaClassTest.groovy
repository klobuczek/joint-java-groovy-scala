package joint

import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals

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
    void testKotlinHello() {
        assertEquals('kotlin', new JavaClass().kotlinHello())
    }
}