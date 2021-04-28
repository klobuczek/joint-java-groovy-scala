package joint

import kotlin.test.Test
import kotlin.test.assertEquals

class KotlinGroovyClassTest {
    @Test
    fun testHello() {
        assertEquals("groovy", GroovyClass().hello())
    }

    @Test
    fun testJavaHello() {
        assertEquals("java", GroovyClass().javaHello())
    }

    @Test
    fun testKotlinHello() {
        assertEquals("kotlin", GroovyClass().kotlinHello())
    }
}
