package joint

import joint.JavaClass
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
    fun testScalaHello() {
        assertEquals("scala", JavaClass().scalaHello())
    }
}