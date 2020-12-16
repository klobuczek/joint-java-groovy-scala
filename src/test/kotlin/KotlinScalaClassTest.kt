import kotlin.test.Test
import kotlin.test.assertEquals

class KotlinScalaClassTest {
    @Test
    fun testHello() {
        assertEquals("scala", ScalaClass().hello())
    }

    @Test
    fun testJavaHello() {
        assertEquals("java", ScalaClass().javaHello())
    }

    @Test
    fun testScalaHello() {
        assertEquals("groovy", ScalaClass().groovyHello())
    }
}
