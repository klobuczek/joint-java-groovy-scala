package joint

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ScalaGroovyClassTest {
  @Test
  def testHello(): Unit = assertEquals("groovy", new joint.GroovyClass().hello)

  @Test
  def testJavaHello(): Unit = assertEquals("java", new joint.GroovyClass().javaHello())

  @Test
  def testScalaHello(): Unit = assertEquals("scala", new joint.GroovyClass().scalaHello)
}
