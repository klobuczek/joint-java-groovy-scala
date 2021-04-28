package joint

import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals

class GroovyKotlinClassTest {
    @Test
    void testHello() {
        assertEquals('kotlin', new KotlinClass().hello())
    }

    @Test
    void testJavaHello() {
        assertEquals('java', new KotlinClass().javaHello())
    }

    @Test
    void testGroovyHello() {
        assertEquals('groovy', new KotlinClass().groovyHello())
    }

//    @Test
//    void testScalaHello() {
//        assertEquals('scala', new KotlinClass().scalaHello())
//    }
}
