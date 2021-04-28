package joint

import kotlin.test.Test
import kotlin.test.assertEquals

class KotlinScalaClassTest {
    @Test
    fun testHello() {
        assertEquals("scala", ScalaClass().hello())
    }

    @Test
    fun testJavaHello() {
        assertEquals("groovy", ScalaClass().groovyHello())
    }

    @Test
    fun testKotlinHello() {
        assertEquals("kotlin", ScalaClass().kotlinHello())
    }
    @Test
    fun testScalaHello() {
        assertEquals("java", ScalaClass().javaHello())
    }
}
