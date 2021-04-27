package joint

import joint.GroovyClass
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
    fun testScalaHello() {
        assertEquals("scala", GroovyClass().scalaHello())
    }
}
