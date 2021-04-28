import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ScalaJavaClassTest {
  @Test
  def testHello(): Unit = assertEquals("java", new JavaClass().hello)

  @Test
  def testGroovyHello(): Unit = assertEquals("groovy", new JavaClass().groovyHello)

  @Test
  def testScalaHello(): Unit = assertEquals("scala", new JavaClass().scalaHello)
}
