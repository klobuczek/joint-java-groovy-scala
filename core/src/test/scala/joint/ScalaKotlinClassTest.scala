package joint

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ScalaKotlinClassTest {
  @Test
  def testHello(): Unit = assertEquals("kotlin", new joint.KotlinClass().hello)

  @Test
  def testGroovyHello(): Unit = assertEquals("groovy", new joint.KotlinClass().groovyHello)

  @Test
  def testJavaHello(): Unit = assertEquals("java", new joint.KotlinClass().javaHello)

  @Test
  def testScalaHello(): Unit = assertEquals("scala", new joint.KotlinClass().scalaHello)
}
