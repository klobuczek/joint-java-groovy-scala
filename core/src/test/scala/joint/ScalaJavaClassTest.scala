package joint

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ScalaJavaClassTest {
  @Test
  def testHello(): Unit = assertEquals("java", new joint.JavaClass().hello)

  @Test
  def testGroovyHello(): Unit = assertEquals("groovy", new joint.JavaClass().groovyHello)

  @Test
  def testScalaHello(): Unit = assertEquals("scala", new joint.JavaClass().scalaHello)
}
