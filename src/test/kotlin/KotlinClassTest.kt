import kotlin.test.Test
import kotlin.test.assertEquals

class KotlinClassTest {
    @Test
    fun testHello() {
        assertEquals("kotlin", KotlinClass().hello())
    }

    @Test
    fun testGroovyHello() {
        assertEquals("groovy", KotlinClass().groovyHello())
    }

    @Test
    fun testJavaHello() {
        assertEquals("java", KotlinClass().javaHello())
    }

    @Test
    fun testScalaHello() {
        assertEquals("scala", KotlinClass().scalaHello())
    }
}
