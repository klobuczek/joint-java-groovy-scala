package joint

import kotlin.test.Test
import kotlin.test.assertEquals

class KotlinJavaClassTest {
    @Test
    fun testHello() {
        assertEquals("java", JavaClass().hello())
    }

    @Test
    fun testJavaHello() {
        assertEquals("groovy", JavaClass().groovyHello())
    }

    @Test
    fun testKotlinHello() {
        assertEquals("kotlin", JavaClass().kotlinHello())
    }
}
