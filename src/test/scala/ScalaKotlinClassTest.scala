import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ScalaKotlinClassTest {
  @Test
  def testHello(): Unit = assertEquals("kotlin", new KotlinClass().hello)

  @Test
  def testGroovyHello(): Unit = assertEquals("groovy", new KotlinClass().groovyHello)

  @Test
  def testJavaHello(): Unit = assertEquals("java", new KotlinClass().javaHello)

  @Test
  def testScalaHello(): Unit = assertEquals("scala", new KotlinClass().scalaHello)
}
